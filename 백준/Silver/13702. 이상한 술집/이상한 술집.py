import sys
input = sys.stdin.readline

N, K = map(int, input().split())
rice_wines = [int(input()) for _ in range(N)]

left = 1
right = max(rice_wines)
ans = 0

while left <= right:
    serving_count  = 0
    mid = (left + right) // 2
    serving_count = sum(wine // mid for wine in rice_wines)

    if serving_count >= K:
        ans = mid 
        left = mid + 1 
    else:
        right = mid - 1 
        
print(ans)