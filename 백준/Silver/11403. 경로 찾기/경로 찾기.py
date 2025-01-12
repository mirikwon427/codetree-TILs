import sys
input = lambda: sys.stdin.readline().rstrip()

INF = int(1e6)

N = int(input())
matrix = [list(map(int, input().split())) for _ in range(N)]

dp = [[INF] * N for _ in range(N)] 

for j in range(N):
    for i in range(N):
        if matrix[j][i] != 0:
            dp[j][i] = matrix[j][i]

for k in range(N):
    for j in range(N):
        for i in range(N):
            dp[j][i] = min(dp[j][i], dp[j][k] + dp[k][i])

for j in range(N):
    for i in range(N):
        if dp[j][i] == INF:
            dp[j][i] = 0
        else:
            dp[j][i] = 1

for row in dp:
    print(' '.join(map(str,row)))
