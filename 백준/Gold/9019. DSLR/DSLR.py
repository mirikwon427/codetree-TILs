import sys
input = lambda: sys.stdin.readline().rstrip()
from collections import deque

dy = [-1, 0, 1, 0]
dx = [0, 1, 0, -1]

def bfs(A, B):
    q = deque()
    q.append((A, ""))
    visited[A] = True

    while q:
        a, b = q.popleft()

        if a == B:
            print(b)
            break

        D = (2 * a) % 10000
        if not visited[D]:
            visited[D] = True
            q.append((D, b + 'D'))

        S = a - 1 if a != 0 else 9999
        if not visited[S]:
            visited[S] = True
            q.append((S,  b + 'S'))   

        L = (a % 1000) * 10 + a // 1000
        if not visited[L]:
            visited[L] = True
            q.append((L, b + 'L'))

        R = (a % 10) * 1000 + a // 10
        if not visited[R]:
            visited[R] = True
            q.append((R, b + 'R'))
        
T = int(input())
for _ in range(T):

    A, B = list(map(int, input().split()))
    visited = [False] * 10000

    bfs(A, B)