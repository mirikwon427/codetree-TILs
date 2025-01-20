import sys
input = sys.stdin.readline

nums = set()
for _ in range(10):
    num = int(input())

    if num % 42 != 0:
        nums.add(num % 42)
    else:
        nums.add(0)

print(len(nums))