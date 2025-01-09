N = int(input())

days = [0] * N
cost = [0] * N

for i in range(N):
    a, b = map(int, input().split())
    days[i] = a
    cost[i] = b

dp = [0] * (N + 1)

for i in range(N):
        if i + days[i] <= N:
            dp[i + days[i]] = max(dp[i + days[i]], dp[i] + cost[i])
        dp[i + 1] = max(dp[i + 1], dp[i])

print(max(dp))