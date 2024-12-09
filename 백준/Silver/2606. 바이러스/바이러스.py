def solve_dfs(node):
    global adj_list, visited, cnt
    
    visited[node] = True
    
    for adj_node in adj_list[node]:
        if not visited[adj_node]:
            cnt += 1
            solve_dfs(adj_node)



N = int(input())
M = int(input())

adj_list = [[] for _ in range(N + 1)]

for _ in range(M):
	a, b = map(int, input().split())
	adj_list[a].append(b)
	adj_list[b].append(a)

for node in range(1, N + 1):
	adj_list[node].sort()

S = 1
cnt = 0

visited = [False] * (N + 1)
solve_dfs(S)
print(cnt)
