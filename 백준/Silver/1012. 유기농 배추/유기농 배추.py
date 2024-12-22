import sys
from collections import deque
input = sys.stdin.readline

dy = [-1, 0, 1, 0]
dx = [0, 1, 0, -1]

def bfs(y, x):
    q = deque()
    q.append((y, x))
    visited[y][x] = True
    
    while q:
        y, x = q.popleft()  # popleft()로 큐에서 꺼냄

        
        for i in range(4):
            ny = y + dy[i]
            nx = x + dx[i]

            if 1 <= ny <= N and 1 <= nx <= M and not visited[ny][nx] and cabbages[ny][nx] == 1:
                q.append((ny, nx))
                visited[ny][nx] = True

T = int(input())  

for _ in range(T):
    
    N, M, K = map(int, input().split())

    cabbages = [[0] * (M + 1) for _ in range(N + 1)]

    for _ in range(K):
        a, b = map(int, input().split())
        cabbages[a + 1][b + 1] = 1  # 1-based index로 설정
    
    visited = [[False] * (M + 1) for _ in range(N + 1)]

    worm = 0
    
    for y in range(1, N + 1):
        for x in range(1, M + 1):
            if cabbages[y][x] == 1 and not visited[y][x]:
                bfs(y, x)
                worm += 1
    
    print(worm)
