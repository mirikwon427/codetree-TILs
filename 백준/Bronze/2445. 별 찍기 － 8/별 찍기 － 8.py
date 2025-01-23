N = int(input())
num = 0
for i in range(1, N * 2):
    star = '*'
    blank = ' '
    if i <= N:
        print(star * i + 2 * (blank * (N - i)) + star * i)
    else:
        num += 2
        print(star * (i - num) + blank * num + star * (i - num))