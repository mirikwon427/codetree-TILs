import sys
input = lambda: sys.stdin.readline().rstrip()

N = int(input())
for _ in range(N):
    M = int(input())
    clothes = {}
    result = 1
    for _ in range(M):
        name, type = map(str, input().split())
        if type in clothes:
            clothes[type] += 1
        else:
            clothes[type] = 1
    
    for count in clothes.values():
        result *= (count + 1)
    
    print(result - 1)   