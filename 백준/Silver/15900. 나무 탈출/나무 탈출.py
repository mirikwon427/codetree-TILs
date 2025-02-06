import sys
input = lambda: sys.stdin.readline().rstrip()
sys.setrecursionlimit(int(1e6))

def dfs(node, depth):
    global adj_list, visited, total
    
    if visited[node] and len(adj_list[node]) == 1:
        total += depth
        return
    
    for next_node in adj_list[node]:
        if next_node != 1 and not visited[next_node]:
            visited[next_node] = True
            dfs(next_node, depth + 1)


N = int(input())
adj_list = [[] for _ in range(N + 1)]
visited = [False] * (N + 1)
for _ in range(1, N):
    a, b = map(int, input().split())
    adj_list[a].append(b)
    adj_list[b].append(a)

total = 0

dfs(1, 0)

if total % 2 == 0:
    print('No')
else:
    print('Yes')