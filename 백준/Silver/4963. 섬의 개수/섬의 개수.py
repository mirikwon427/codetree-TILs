import sys
input = sys.stdin.readline
sys.setrecursionlimit(int(1e6))

dy = [1, 0, -1, 0, -1, -1, 1, 1]
dx = [0, -1, 0, 1, -1, 1, -1, 1]

def dfs(y, x):
    global visited
    
    visited[y][x] = True
    
    for i in range(8):
        ny = y + dy[i]
        nx = x + dx[i]
        
        if 0 <= ny < h and 0 <= nx < w and matrix[ny][nx] == 1 and not visited[ny][nx]:
            dfs(ny, nx)

while True:
    w, h = map(int, input().split())
    matrix = [list(map(int, input().split())) for _ in range(h)]
    visited = [[False] * w for _ in range(h)]
    count = 0
    
    if w == 0 and h == 0:
        break
    
    for y in range(h):
        for x in range(w):
            if matrix[y][x] == 1 and not visited[y][x]:
                dfs(y, x)
                count += 1
                
    print(count)