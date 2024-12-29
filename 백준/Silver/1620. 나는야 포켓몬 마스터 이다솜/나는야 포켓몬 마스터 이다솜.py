import sys
input = lambda: sys.stdin.readline().rstrip()

N, M = map(int, input().split())

poketmons = {}
reverse_poketmons = {}

for i in range(1, N + 1):
    name = input()
    poketmons[i] = name
    reverse_poketmons[name] = i

for i in range(1, M + 1):
    query = input()
    if query.isdigit():
        print(poketmons[int(query)])
    else:
        print(reverse_poketmons[query])
    