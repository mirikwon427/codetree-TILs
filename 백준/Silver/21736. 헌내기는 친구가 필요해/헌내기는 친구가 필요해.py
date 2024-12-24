import sys
input = sys.stdin.readline
from collections import deque

dy = [1, -1, 0, 0]
dx = [0, 0, 1, -1]

def bfs(y, x):
    global count
    q = deque()
    q.append((y, x))
    visited[y][x] = True

    while q:
        y, x = q.popleft()

        for i in range(4):
            ny = y + dy[i]
            nx = x + dx[i]

            if 0 <= ny < M and 0 <= nx < N and not visited[ny][nx]:
                if campus[ny][nx] != "X":
                    visited[ny][nx] = True
                    q.append((ny, nx))
                    if campus[ny][nx] == "P":
                        count += 1

M, N = map(int, input().split())

campus = [list(input().strip()) for _ in range(M)]
visited = [[False] * N for _ in range(M)]
count = 0

start_y, start_x = -1, -1
for y in range(M):
    for x in range(N):
        if campus[y][x] == "I":
            start_y, start_x = y, x
            break

if start_y != -1 and start_x != -1:
    bfs(start_y, start_x)

if count == 0:
    print("TT") 
else:
    print(count) 