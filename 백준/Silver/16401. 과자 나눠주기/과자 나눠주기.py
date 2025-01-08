import sys
input = lambda: sys.stdin.readline().rstrip()

def pick(snacks):
    left = 1
    right = max(snacks)
    result = 0
    
    while left <= right:
        mid = (left + right) // 2
        count = 0
        
        for i in range(len(snacks)):
            count += snacks[i] // mid
        
        if count >= N:
            result = mid
            left = mid + 1
        else:
            right = mid - 1
            
    return result

N, M = map(int, input().split())

snacks = list(map(int, input().split()))

print(pick(snacks))