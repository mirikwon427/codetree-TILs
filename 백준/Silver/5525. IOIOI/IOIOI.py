import sys
input = sys.stdin.readline

N = int(input())
M = int(input())
S = input().strip()

count = 0
i = 0
pattern_count = 0

while i < M - 1:
    if S[i:i+3] == 'IOI':
        pattern_count += 1
        i += 2
        
        if pattern_count >= N:
            count += 1
    else:
        pattern_count = 0
        i += 1

print(count)
