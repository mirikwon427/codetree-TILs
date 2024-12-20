import sys
input = sys.stdin.readline
peoples = ()

N = int(input())
for _ in range(N):
    peoples += (tuple(map(int, input().split())),)

arr = [1] * (N)

for i in range(N):
    weight = peoples[i][0]
    height = peoples[i][1]
    for j in range(N):
        if i != j:
            if weight < peoples[j][0] and height < peoples[j][1]:
                arr[i] += 1

print(*arr)