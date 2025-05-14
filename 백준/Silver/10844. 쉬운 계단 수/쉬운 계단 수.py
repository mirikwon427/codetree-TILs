import sys
input = sys.stdin.readline

MOD = 1000000000

dp = [[0 for _ in range(10)] for _ in range(101)]

for i in range(1, 10):
    dp[1][i] = 1

for i in range(2, 101):
    for j in range(10):
        if j > 0:
            dp[i][j] += dp[i-1][j-1]
        if j < 9:
            dp[i][j] += dp[i-1][j+1]
        dp[i][j] %= MOD

N = int(input())
ans = 0

for i in range(10):
    ans += dp[N][i]
    ans %= MOD

print(ans)