import sys
input = sys.stdin.readline

while True:
    num = int(input())

    if num == 0:
        break
    if num == 1:
        print(1)
        continue

    nums = [0] * (num * 2)

    nums[0], nums[1] = 0, 1
    count = 0

    for i in range(2, num * 2):
        nums[i] = i

    for i in range(2, num * 2):
        if nums[i] != 0: 
            for j in range(i * i, num * 2, i):
                nums[j] = 0

    for i in range(num + 1, num * 2):
        if nums[i] != 0:
            count += 1

    print(count)