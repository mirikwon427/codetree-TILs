import sys
input = lambda: sys.stdin.readline().rstrip()

N = int(input())
candy = list(map(int,input().split()))

fruits = {}
max_len = 0
right = -1

for left in range(N):
    while (right + 1) < N:
        next_fruit = candy[right + 1]
        if next_fruit not in fruits:
            if len(fruits) == 2:
                break
        fruits[next_fruit] = fruits.get(next_fruit, 0) + 1
        right += 1
    
    max_len = max(max_len, right - left + 1)
    
    remove_fruit = candy[left]
    fruits[remove_fruit] -= 1
    
    if  fruits[remove_fruit] == 0:
        del fruits[remove_fruit]

print(max_len)
