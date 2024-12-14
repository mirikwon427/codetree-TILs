import sys
input = sys.stdin.readline

N = int(input())
score = [0] * 301
dp = [0] * 301

for i in range(1, N + 1):
    score[i] = int(input())

dp[1] = score[1]
if N >= 2:
    dp[2] = score[1] + score[2]
if N >= 3:
    dp[3] = max(score[1] + score[3], score[2] + score[3])

for i in range(4, N + 1):
    dp[i] = max(dp[i - 2] + score[i], dp[i - 3] + score[i - 1] + score[i])

print(dp[N])