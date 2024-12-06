N, M = map(int, input().split())

arr = list(map(int, input().split()))

ans = 0

right = -1
cur_sum = 0

for left in range(N):
    while (right + 1 < N) and (cur_sum + arr[right + 1] <= M):
        right += 1
        cur_sum += arr[right]
        
    if cur_sum == M:
        ans += 1
    
    cur_sum -= arr[left]
    
print(ans)