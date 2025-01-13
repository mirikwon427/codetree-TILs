import sys
input = lambda: sys.stdin.readline().rstrip()

N, M = map(int, input().split())

matrix = [list(map(int, input().split())) for _ in range(N)]
dp = [[0] * (N + 1) for _ in range(N + 1)]

for i in range(1, N + 1):
    for j in range(1, N + 1):
        dp[i][j] = matrix[i - 1][j - 1] + dp[i - 1][j] + dp[i][j - 1] - dp[i - 1][j - 1]

for _ in range(M):
    a, b, c, d = map(int, input().split())
    result = dp[c][d] - dp[a-1][d] - dp[c][b-1] + dp[a-1][b-1]
    print(result)   