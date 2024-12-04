N, H = map(int, input().split())

tree = list(map(int, input().split()))

sorted_tree = sorted(tree)

start, end = 1, max(tree)

while start <= end:
    sum = 0
    mid = (start + end) // 2

    for len in sorted_tree:
        if len > mid:
            sum += len - mid  
    
    if sum < H:  
        end = mid - 1
    else:  
        start = mid + 1

print(end) 