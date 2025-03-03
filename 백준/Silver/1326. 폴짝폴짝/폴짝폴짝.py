import sys
input = sys.stdin.readline
from collections import deque

def bfs():
    q = deque()
    visited = [-1 for _ in range(N)]
    
    q. append(a - 1)
    visited[a - 1] = 0
    
    while q:
        now = q.popleft()
        
        for i in range(now, N, arr[now]):
            if visited[i] == -1:
                q.append(i)
                visited[i] = visited[now] + 1
                if i == b - 1:
                    return visited[i]
        for i in range(now, -1, -arr[now]):
            if visited[i] == -1:
                q.append(i)
                visited[i] = visited[now] + 1
                if i == b - 1:
                    return visited[i]
    return -1

N = int(input())
arr = list(map(int, input().split()))
a, b = map(int, input().split())

print(bfs())
