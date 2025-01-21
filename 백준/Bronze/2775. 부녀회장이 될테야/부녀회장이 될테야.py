import sys
input = sys.stdin.readline

T = int(input())

for _ in range(T):
    K = int(input())
    N = int(input())
    
    apartment = [[0] * (N + 1) for _ in range(K)]   

    for k in range(N + 1):
        apartment[0][k] = k

    for i in range(1, K):
        for j in range(1, N + 1):
            apartment[i][j] = apartment[i][j - 1] + apartment[i - 1][j]

    ans = 0
    for m in range(1, N + 1):
        ans += apartment[K - 1][m]
        
    print(ans)