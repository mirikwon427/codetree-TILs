import sys
input = sys.stdin.readline

f = [0] * 11
f[1] = 1
f[2] = 2
f[3] = 4

for i in range(4, 11):
    f[i] = f[i - 1] + f[i - 2] + f[i - 3]

n = int(input())

for _ in range(n):
    T = int(input())
    print(f[T]) 