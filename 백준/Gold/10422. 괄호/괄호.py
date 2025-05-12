import sys
input = sys.stdin.readline

mod = 1000000007

dp = [0 for _ in range(5001)]
dp[0] = 1

for i in range(2, 5001, 2):
    for j in range(2, i + 1, 2):
        dp[i] += (dp[j - 2] * dp[i - j])
    dp[i] %= mod

T = int(input())

for _ in range(T):
    print(dp[int(input())])