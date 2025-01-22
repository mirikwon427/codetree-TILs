import sys
input = lambda: sys.stdin.readline().rstrip()
from collections import deque

dy = [-1, 0, 1, 0]
dx = [0, 1, 0, -1]

def bfs(y, x):
    q = deque()
    q.append((y, x))
    

    while q:
        y, x = q.popleft()

        for i in range(4):
            ny = y + dy[i]
            nx = x + dx[i]
        
            if 0 <= ny < N and 0 <= nx < M and matrix[ny][nx] == 1 and distance[ny][nx] == 0:
                distance[ny][nx] = distance[y][x] + 1
                q.append((ny, nx))

N, M = map(int, input().split())

matrix = [[0] * M for _ in range(N)]
distance = [[0] * M for _ in range(N)]

for y in range(N):
    row = list(map(int, input().split()))
    for x in range(M):
        matrix[y][x] = row[x]

for y in range(N):
    for x in range(M):
        if matrix[y][x] == 2:
            bfs(y, x)
            distance[y][x] = 0

for y in range(N):
    for x in range(M):
        if matrix[y][x] != 2 and matrix[y][x] != 0 and distance[y][x] == 0:
            distance[y][x] = -1

for row in distance:
    print(*row)