N = int(input())
    
for i in range(1, N + 1):
    star = '*'
    blank = ' '
    print(blank * (N - i) + star * i)