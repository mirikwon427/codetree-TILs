import sys
input = sys.stdin.readline

n = int(input())
arr = list(map(int, input().split()))

arr.sort()

count = 0

for i in range(n - 2):
    left = i + 1
    right = n - 1
    while left < right:
        total = arr[i] + arr[left] + arr[right]
        if total == 0:
            if arr[left] == arr[right]:
                c = right - left + 1
                count += c * (c - 1) // 2
                break
            l_cnt = 1
            while left + l_cnt < right and arr[left + l_cnt] == arr[left]:
                l_cnt += 1
            r_cnt = 1
            while right - r_cnt > left and arr[right - r_cnt] == arr[right]:
                r_cnt += 1
            
            count += l_cnt * r_cnt
            
            left += l_cnt
            right -= r_cnt
        elif total < 0:
            left += 1
        else:
            right -= 1
print(count)