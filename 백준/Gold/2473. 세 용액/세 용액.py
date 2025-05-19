import sys
input = sys.stdin.readline

n = int(input())
arr = list(map(int, input().split()))

arr.sort()

mix = 3e9
x, y, z = 0, 0, 0

for i in range(n):
    left = i + 1
    right = n - 1
    
    while left < right:
        new_mix = arr[i] + arr[left] + arr[right]
        
        if abs(new_mix) <= mix:
            mix = abs(new_mix)
            x = arr[i]
            y = arr[left]
            z = arr[right]
        
        if new_mix < 0:
            left += 1
        else:
            right -= 1

print(x, y, z)