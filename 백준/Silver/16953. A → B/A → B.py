import sys
input = lambda: sys.stdin.readline().rstrip()

N, M = map(int, input().split())
count = 1

while True:

    if M == N:
        print(count)
        break
    elif M < N:
        print(-1)
        break

    if M % 2 == 0:
        M = M // 2
    elif M % 10 == 1:
        M = M // 10
    else:
        print(-1)
        break

    count += 1