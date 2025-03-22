import sys
input = sys.stdin.readline

N = int(input())
arr = list(map(int, input().split()))
dp = [float('inf')] * N

dp[0] = 0

for i in range(N):
    for j in range(1, arr[i] + 1):
        if i + j < N:
            dp[i + j] = min(dp[i + j], dp[i] + 1)

if dp[N - 1] != float('inf'):
    print(dp[N - 1])
else:
    print(-1)
