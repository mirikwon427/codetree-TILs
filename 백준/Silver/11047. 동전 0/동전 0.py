N, K = map(int, input().split())

arr = [int(input()) for _ in range(N)]

sorted_arr = sorted(arr, reverse=True)

cnt = 0

for coin in sorted_arr:
    if K == 0:
        break
    cnt += K // coin
    K %= coin

print(cnt)