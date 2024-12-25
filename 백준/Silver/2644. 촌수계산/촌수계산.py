import sys
input = sys.stdin.readline

def dfs(node, depth):
	if node == y:
		print(depth)
		exit()

	if visited[node]:
		return

	visited[node] = True
	for adj_node in adj_list[node]:
		if not visited[adj_node]:
			dfs(adj_node, depth + 1)

N = int(input())
x, y = map(int, input().split())
M = int(input())

adj_list = [[] for _ in range(N + 1)]

for _ in range(M):
	u, v = map(int, input().split())
	adj_list[u].append(v)
	adj_list[v].append(u)

visited = [False] * (N + 1)

dfs(x, 0)

print(-1)