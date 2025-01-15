import sys
input = sys.stdin.readline

def nm(start, depth, seq):
    if depth == M:
        print(*seq)
        return
    for num in range(start, N + 1):
        seq.append(num)
        nm(num, depth + 1, seq)
        seq.pop()

N, M = map(int, input().split())
nm(1, 0, [])