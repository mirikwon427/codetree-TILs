import sys
input = sys.stdin.readline

N = int(input())
first_row = list(map(int, input().split()))

maxDP = [first_row[:], [0] * 3]
minDP = [first_row[:], [0] * 3]

for i in range(1, N):
    matrix = list(map(int, input().split()))
    
    maxDP[1][0] = max(maxDP[0][0], maxDP[0][1]) + matrix[0]
    maxDP[1][1] = max(maxDP[0]) + matrix[1]
    maxDP[1][2] = max(maxDP[0][1], maxDP[0][2]) + matrix[2]
    
    minDP[1][0] = min(minDP[0][0], minDP[0][1]) + matrix[0]
    minDP[1][1] = min(minDP[0]) + matrix[1]
    minDP[1][2] = min(minDP[0][1], minDP[0][2]) + matrix[2]
    
    maxDP[0], maxDP[1] = maxDP[1], maxDP[0]
    minDP[0], minDP[1] = minDP[1], minDP[0]

print(max(maxDP[0]), min(minDP[0]))