import sys
input = sys.stdin.readline
from collections import deque

dy = [-1, 0, 1, 0]
dx = [0, 1, 0, -1]

def bfs():
    q = deque()
    q.append((0, 0, 0))
    visited[0][0][0] = 1
    
    while q:
        y, x, broken = q.popleft()
        
        if y == N - 1 and x == M - 1:
            return visited[y][x][broken]
        
        for i in range(4):
            ny = y + dy[i]
            nx = x + dx[i]
            
            if 0 <= ny < N and 0 <= nx < M:
                if matrix[ny][nx] == 0 and visited[ny][nx][broken] == 0:
                    visited[ny][nx][broken] = visited[y][x][broken] + 1
                    q.append((ny, nx, broken))
                    
                if matrix[ny][nx] == 1 and broken == 0:
                    visited[ny][nx][1] = visited[y][x][broken] + 1
                    q.append((ny, nx, 1))
    return -1

N, M= map(int, input().split())
matrix = [[0] * M for _ in range(N)]

for x in range(N):
    matrix[x] = list(map(int, input().strip()))

visited = [[[0] * 2 for _ in range(M)] for _ in range(N)]

print(bfs())