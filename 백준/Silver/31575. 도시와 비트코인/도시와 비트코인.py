import sys
input = lambda: sys.stdin.readline().rstrip()
from collections import deque

N, M= map(int, input().split())

dy = [0, 1]
dx = [1, 0]

def bfs(y, x):
    global count, visited, matrix
    q = deque()
    q.append((y, x))
    visited[y][x] = True

    while q:
        y, x = q.popleft()

        if y == M - 1 and x == N - 1:
            return True

        for i in range(2):
            ny = y + dy[i]
            nx = x + dx[i]

            if 0 <= ny < M and 0 <= nx < N and matrix[ny][nx] == 1 and not visited[ny][nx]:
                visited[ny][nx] = True
                q.append((ny, nx))

matrix = [list(map(int, input().split())) for _ in range(M)]

visited = [[False] * N for _ in range(M)]

if bfs(0,0):
    print('Yes')
else:
    print('No')
        