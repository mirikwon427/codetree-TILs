import sys
input = lambda: sys.stdin.readline().rstrip()
sys.setrecursionlimit(int(1e6))

def divide(x, y, n):
    global zero, one, matrix
    
    same_num = True
    num = matrix[x][y]
    
    for i in range(x, x + n):
        for j in range(y, y + n):
            if matrix[i][j] != num:
                same_num = False
                break
    if same_num:
        if num == 0:
            zero += 1
        else:
            one += 1
    else:
        n //= 2
        divide(x, y, n)
        divide(x, y + n, n)
        divide(x + n, y, n)
        divide(x + n, y + n, n)
            
N = int(input())
matrix = [list(map(int, input().split())) for _ in range(N)]
zero, one = 0, 0

divide(0, 0, N)

print(zero, one, sep = '\n')