import sys
input = lambda: sys.stdin.readline().rstrip()
sys.setrecursionlimit(int(1e6))

dy = [-1, 0, 1, 0]
dx = [0, 1, 0, -1]

def dfs(y, x, length):
    global matrix, visited, ans
    
    if y == 0 and x == C - 1 and length == K:
        ans += 1
        return
    
    visited[y][x] = True
    
    for i in range(4):
        ny = y + dy[i]
        nx = x + dx[i]
        
        if 0 <= ny < R and 0 <= nx < C and not visited[ny][nx] and matrix[ny][nx] != 'T':
            dfs(ny, nx, length + 1)
            
    visited[y][x] = False

R, C, K = map(int, input().split())

matrix = [list(input().strip()) for _ in range(R)]
visited = [[False] * C for _ in range(R)]
ans = 0

dfs(R - 1, 0, 1)

print(ans)