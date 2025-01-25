N = int(input())
dp = [0] * 10007
for i in range(11):
    dp[i] = i

for i in range(N - 1):
    for i in range(2, 11):
        dp[i] = dp[i - 1] + dp[i]

print(dp[10] % 10007)