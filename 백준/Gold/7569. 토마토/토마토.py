import sys
input = sys.stdin.readline
from collections import deque

dz = [1, -1, 0, 0, 0, 0]
dy = [0, 0, 1, -1, 0, 0]
dx = [0, 0, 0, 0, 1, -1]


def bfs():
    while q:
        z, y, x = q.popleft()
        for i in range(6):
            nz = z + dz[i]
            ny = y + dy[i]
            nx = x + dx[i]

            if 0 <= nz < H and 0 <= ny < N and 0 <= nx < M:
                if tomatoes[nz][ny][nx] == 0:
                    tomatoes[nz][ny][nx] = tomatoes[z][y][x] + 1
                    q.append((nz, ny, nx))
    max_day = 0
    for h in range(H):
        for n in range(N):
            for m in range(M):
                if tomatoes[h][n][m] == 0:
                    return -1
                max_day = max(max_day, tomatoes[h][n][m])

    return max_day - 1


M, N, H = map(int, input().split())
q = deque()

tomatoes = [[list(map(int, input().split())) for _ in range(N)] for _ in range(H)]
q = deque((h, n, m) for h in range(H) for n in range(N) for m in range(M) if tomatoes[h][n][m] == 1)

visited = [[[False] * M for _ in range(N)] for _ in range(H)]

print(bfs())