import sys
N = int(input())

arr = list(map(int, input().split()))

sort_arr = sorted(arr)

start = 0
end = N - 1
min = sys.maxsize

while start < end:
    sum = sort_arr[start] + sort_arr[end]
    
    if abs(sum) < min:
        min = abs(sum)
        result = [sort_arr[start],sort_arr[end]]
    if sum < 0:
        start += 1
    elif sum > 0:
        end -= 1
    else:
        break
        
print(result[0],result[1])
        