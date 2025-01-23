N = int(input())

for i in range(N, 0, -1):
    star = '*'
    blank = ' '
    print(blank * (N - i) + star * i)