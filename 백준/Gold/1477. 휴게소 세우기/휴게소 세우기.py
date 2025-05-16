import sys
input = sys.stdin.readline

n, m, l = map(int, input().split())
arr = list(map(int, input().split()))

arr.append(0)
arr.append(l)
arr.sort()

start = 1
end = l
ans = 0

while start <= end:
    mid = (start + end) // 2
    count = 0
    
    for i in range(1, len(arr)):
        count += (arr[i] - arr[i - 1] - 1) // mid
    if count > m:
        start = mid + 1
    else:
        end = mid - 1
        ans = mid

print(ans)