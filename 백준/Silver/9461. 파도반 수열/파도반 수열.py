N = int(input())

for _ in range(N):
    M = int(input())
    dp = [0] * (M + 1)
    
    for i in range(1, min(4, M + 1)):
        dp[i] = 1
    
    if M < 4:
        print(dp[M])
    else: 
        for i in range(4, M + 1):
            dp[i] = dp[i - 2] + dp[i - 3]
        print(dp[M])

	