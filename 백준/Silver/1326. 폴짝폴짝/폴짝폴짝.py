import sys
input = sys.stdin.readline
from collections import deque

def bfs():
    global visited

    visited[a-1] = 0
    q = deque()
    q.append(a - 1)

    while q:
        now = q.popleft()

        for i in range(now, N, arr[now]):
            if visited[i] == -1:
                visited[i] = visited[now] + 1
                q.append(i)
                if i == b - 1:
                    return visited[i]

        for i in range(now, -1, -arr[now]):
            if visited[i] == -1:
                visited[i] = visited[now] + 1
                q.append(i)
                if i == b - 1:
                    return visited[i]
    return -1


N = int(input())
arr = list(map(int, input().split()))
a, b = map(int, input().split())

visited = [-1] * N

print(bfs())