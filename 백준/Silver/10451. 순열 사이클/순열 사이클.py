import sys
sys.setrecursionlimit(int(1e6))

def dfs(node):
    global perm, visited
    
    if visited[node]:
        return
    visited[node] = True
    
    dfs(perm[node])
        
T = int(input())
for _ in range(T):
    N = int(input())
    perm = [0] + list(map(int,input().split()))
    
    visited = [False] * (N + 1)
    num_of_cc = 0
    
    for node in range(1, N + 1):
        if not visited[node]:
            dfs(node)
            num_of_cc += 1
    
    print(num_of_cc)