import sys
input = sys.stdin.readline

T = int(input())

for _ in range(T):
    N = int(input())
    dp = [0] * (N + 1)
    dp[0] = 1
    
    for i in range(1, N + 1):
        if i >= 1:
            dp[i] += dp[i - 1]
        if i >= 2:
            dp[i] += dp[i - 2]
        if i >= 3:
            dp[i] += dp[i - 3]
            
    print(dp[i])