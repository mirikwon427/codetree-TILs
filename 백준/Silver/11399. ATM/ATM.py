import sys
input = sys.stdin.readline

N = int(input())
peoples = list(map(int, input().split()))

num = 0
sorted_peoples = sorted(peoples)

for i in range(N + 1):
    for j in range(i):
        num += sorted_peoples[j]

print(num)
