N = int(input())

for i in range(1, N * 2):
    star = '*'
    blank = ' '
    if i <= N:
        num = i + (i - 1)
        if i == 1:
            print(blank * (N - i) + star * i)
            continue
        print(blank * (N - i) + star * num)
    else:
        num -= 2
        print(blank * (i - N) + star * num)