N, M = map(int, input().split())

lects = list(map(int, input().split()))

start, end = max(lects), sum(lects)
ans = 0

while start <= end:
    mid = (start + end) // 2
    sum = 0
    cnt = 1
    for lect in lects:
        if sum + lect > mid:
            cnt += 1
            sum = 0
        sum += lect
    if cnt > M:
        start = mid + 1
    else:
        end = mid - 1
        ans = mid
print(ans)