N = int(input())

for i in range(1, N + 1):
    star = '*'
    blank = ' '
    num = i + (i - 1)
    if i == 1:
        print(blank * (N - i) + star * i)
        continue
    print(blank * (N - i) + star * num)    
    