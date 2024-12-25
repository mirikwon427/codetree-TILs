import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**6)

def dfs(node):
    visited[node] = True
    
    for adj_node in adj_list[node]:
        if visited[adj_node] == False:
            dfs(adj_node)

N, M = map(int, input().split())

adj_list = [[] for _ in range(N + 1)]

for _ in range(M):
    u, v = map(int, input().split())
    adj_list[u].append(v)
    adj_list[v].append(u)

visited = [False] * (N + 1)
adj_count = 0

for i in range(1, N + 1):
    if visited[i] == False:
        dfs(i)
        adj_count += 1

print(adj_count)