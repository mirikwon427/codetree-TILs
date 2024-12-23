import sys
input = sys.stdin.readline
from collections import deque

dy = [-1, 0, 1, 0]
dx = [0, 1, 0, -1]

def bfs(y, x):
    q = deque()
    q.append((y, x))
    visited[y][x] = True
    area = 1
    
    while q:
        y, x = q.popleft()
        
        for i in range(4):
            ny = y + dy[i]
            nx = x + dx[i]
            
            if 0 <= ny < M and 0 <= nx < N and not visited[ny][nx] and matrix[ny][nx] == 0:
                q.append((ny, nx))
                visited[ny][nx] = True
                area += 1
    return area

M, N, K = map(int, input().split())
matrix = [[0] * N for _ in range(M)]

for _ in range(K):
    a, b, c, d = map(int, input().split())
    for y in range(b, d):
        for x in range(a, c):
            matrix[M - 1 - y][x] = 1

visited = [[False] * N for _ in range(M)]
areas = []

for y in range(M):
    for x in range(N):
        if not visited[y][x] and matrix[y][x] == 0:
            areas.append(bfs(y, x))

areas.sort()
print(len(areas))
print(*areas)