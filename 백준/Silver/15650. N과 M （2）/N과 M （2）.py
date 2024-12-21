import sys
input = sys.stdin.readline

def backtrack(start):
    if len(seq) == M:
        print(*seq)
        return
    
    for i in range(start, N + 1):
        seq.append(i)
        backtrack(i + 1)
        seq.pop()

N, M = map(int, input().split())
seq = []
backtrack(1)