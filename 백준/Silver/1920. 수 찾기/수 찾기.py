ㅍN = int(input())
arr = list(map(int, input().split()))
M = int(input())
arr2 = list(map(int, input().split()))

sorted_arr = sorted(arr)

ans = []

for num in arr2:
    left = 0
    right = len(sorted_arr) - 1
    while left <= right:
        mid = (left + right) // 2
        if sorted_arr[mid] < num:
            left = mid + 1
        elif sorted_arr[mid] > num:
            right = mid - 1
        else:
            ans.append(1)
            break
    else:
        ans.append(0)

for answer in ans:
    print(answer)
