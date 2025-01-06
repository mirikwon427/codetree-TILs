M, N = map(int, input().split())

nums = [0] * (N + 1)

nums[0], nums[1] = 0, 0

for i in range(2, N + 1):
    nums[i] = i

for i in range(2, N + 1):
    if nums[i] != 0: 
        for j in range(i * i, N + 1, i):
            nums[j] = 0

for i in range(M, N + 1):
    if nums[i] != 0:
        print(nums[i])

