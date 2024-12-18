import sys
sys.setrecursionlimit(10**6)
input = sys.stdin.readline

def dfs(node):
    for adj_node in adj_list[node]:
        if parent[adj_node] == 0:
            parent[adj_node] = node
            dfs(adj_node)

N = int(input())
adj_list = [[] for _ in range(N + 1)]

for _ in range(N - 1):
    a, b = map(int, input().split())
    adj_list[a].append(b)
    adj_list[b].append(a)

parent = [0] * (N + 1)

dfs(1)

for i in range(2, N + 1):
    print(parent[i])
