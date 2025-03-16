import sys
input = sys.stdin.readline

N = int(input())
M = int(input())
x = list(map(int, input().split()))

left = 0
right = N
ans = N

while left <= right:
    mid = (left + right) // 2
    
    covered = 0
    possible = True
    
    for i in range(M):
        if x[i] - mid > covered:
            possble = False
            break
        covered = x[i] + mid
    
    if possible and covered >= N:
        ans = mid
        right = mid - 1
    else:
        left = mid + 1

print(ans)