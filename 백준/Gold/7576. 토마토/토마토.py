import sys
input = sys.stdin.readline
from collections import deque

dy = [-1, 0, 1, 0]
dx = [0, 1, 0, -1]

m, n = map(int, input().split())
tomatoes = [list(map(int, input().split())) for _ in range(n)]

q = deque()

for y in range(n):
    for x in range(m):
        if tomatoes[y][x] == 1:
            q.append((y, x))

while q:
    y, x = q.popleft()
    
    for i in range(4):
        ny = y + dy[i]
        nx = x + dx[i]
        
        if 0 <= ny < n and 0 <= nx < m and tomatoes[ny][nx] == 0:
            tomatoes[ny][nx] = tomatoes[y][x] + 1
            q.append((ny, nx))
result = 0
for row in tomatoes:
    for t in row:
        if t == 0:
            print(-1)
            sys.exit(0)
        result = max(result, t)
print(result - 1)