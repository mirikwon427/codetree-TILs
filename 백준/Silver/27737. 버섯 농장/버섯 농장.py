import sys
input = sys.stdin.readline
from collections import deque

dy = [-1, 0, 1, 0]
dx = [0, 1, 0, -1]

def bfs(y, x):
    global visited

    q = deque()
    q.append((y, x))
    visited[y][x] = True
    count = 1

    while q:
        y, x = q.popleft()

        for i in range(4):
            ny = y + dy[i]
            nx = x + dx[i]

            if 0 <= ny < N and 0 <= nx < N and not visited[ny][nx] and matrix[ny][nx] == 0 and count < K:
                visited[ny][nx] = True
                count += 1
                q.append((ny, nx))


N, M, K = map(int, input().split())
matrix = [list(map(int, input().split())) for _ in range(N)]
visited = [[False] * N for _ in range(N)]
answer = 0

for y in range(N):
    for x in range(N):
        if matrix[y][x] == 0 and not visited[y][x]:
            bfs(y, x)
            answer +=1

if answer != 0 and answer <= M:
    print('POSSIBLE')
    print(M - answer)
else:
    print('IMPOSSIBLE')