import sys
input = sys.stdin.readline

A, K = map(int, input().split())
count = 0

while True:

    if K % 2 == 0 and K // 2 >= A:
        K = K // 2
    else:
        K = K - 1

    count += 1

    if A == K:
        break

print(count)