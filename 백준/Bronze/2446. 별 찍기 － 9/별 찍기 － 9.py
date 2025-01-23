N = int(input())
for i in range(1, 2 * N):
    star = '*'
    blank = ' '
    if i <= N:
        print(blank * (i - 1) + star * (2 * (N - i) + 1) + blank)
    else:
        print(blank * (2 * N - i - 1) + star * (2 * (i - N) + 1) + blank)