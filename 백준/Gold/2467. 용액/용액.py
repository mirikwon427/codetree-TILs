import sys
input = sys.stdin.readline

N = int(input())
solutions = list(map(int, input().split()))

left, right = 0, N - 1
sum = float('inf')
pair = (solutions[left], solutions[right])

while left < right:
    mix = solutions[left] + solutions[right]

    if abs(mix) < abs(sum):
        sum = mix
        pair = (solutions[left], solutions[right])
    
    if mix == 0:
        break
        
    if mix < 0:
        left += 1
    else:
        right -= 1

print(pair[0], pair[1])