import sys
input = sys.stdin.readline

N = int(input())

for _ in range(N):
    N = int(input())
    a, b = 1, 0
    for i in range(N):
        a,b = b, a + b 
    print(a,b)
