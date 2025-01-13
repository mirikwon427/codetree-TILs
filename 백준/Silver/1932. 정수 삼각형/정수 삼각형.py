import sys
input = lambda: sys.stdin.readline().rstrip()

N = int(input())

tree = [list(map(int, input().split())) for _ in range(N)]
dp = [[0] * N for _ in range(N)]

dp[0][0] = tree[0][0]

for i in range(1, N):
    for j in range(i + 1):
        if j == 0:
            dp[i][j] = tree[i][j] + dp[i - 1][j]
        elif j == i:
            dp[i][j] = tree[i][j] + dp[i - 1][j - 1]
        else:
            dp[i][j] = tree[i][j] + max(dp[i - 1][j - 1], dp[i - 1][j])

print(max(dp[-1]))