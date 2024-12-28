import sys
input = sys.stdin.readline
from collections import deque

dy = [1, -1, 0, 0]
dx = [0, 0, 1, -1]

def bfs(y, x, grid, visited):

    q = deque()
    q.append((y, x))
    visited[y][x] = True
    color = grid[y][x]

    while q:
        y, x = q.popleft()

        for i in range(4):
            ny = y + dy[i]
            nx = x + dx[i]

            if 0 <= ny < N and 0 <= nx < N and not visited[ny][nx]:
                if grid[ny][nx] == color:
                    visited[ny][nx] = True
                    q.append((ny, nx))


N = int(input())

matrix = [list(input().strip()) for _ in range(N)]
blind_matrix = [list(row) for row in matrix]


for y in range(N):
    for x in range(N):
        if matrix[y][x] == 'G':
            blind_matrix[y][x] = 'R'

visited = [[False] * N for _ in range(N)]
blind_visited = [[False] * N for _ in range(N)]

count = 0
blind = 0

for y in range(N):
    for x in range(N):
        if not visited[y][x]:
            bfs(y, x, matrix, visited)
            count += 1

for y in range(N):
    for x in range(N):
        if not blind_visited[y][x]:
            bfs(y, x, blind_matrix, blind_visited)
            blind += 1

print(count, blind)