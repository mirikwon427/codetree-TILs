import sys, math
input = sys.stdin.readline

N = int(input())

farm = []
for _ in range(6):
    num, length = map(int, input().split())
    farm.append((num, length))

width, height = 0, 0
w_idx, h_idx = 0, 0

for i in range(6):
    num, length = farm[i]
    if num in (1, 2):
        if farm[i][1] > width:
            width = farm[i][1]
            w_idx = i 
    if num in (3, 4):
        if farm[i][1] > height:
            height = farm[i][1]
            h_idx = i

small_width = abs(farm[(w_idx - 1) % 6][1] - farm[(w_idx + 1) % 6][1])
small_height = abs(farm[(h_idx - 1) % 6][1] - farm[(h_idx + 1) % 6][1])

melons = ((width * height) - (small_width * small_height)) * N

print(melons)