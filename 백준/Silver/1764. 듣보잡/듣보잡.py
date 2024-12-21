import sys
input = sys.stdin.readline

N, M = map(int, input().split())

heard = set(input().strip() for _ in range(N))
seen = set(input().strip() for _ in range(N))

common_names = sorted(heard & seen)
print(len(common_names))
print('\n'.join(common_names))  