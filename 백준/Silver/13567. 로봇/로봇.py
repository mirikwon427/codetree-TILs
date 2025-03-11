import sys
input = sys.stdin.readline

M, n = map(int, input().split())
matrix = [[0] * M for _ in range(M)]

dir = 0
y, x = 0, 0
valid = True

for _ in range(n):
    command, value = input().split()
    value = int(value)
    
    if command == 'TURN':
        if value == 0:
            dir = (dir - 1) % 4
        else:
            dir = (dir + 1) % 4
    else:
        if dir == 0:
            y += value
        elif dir == 1:
            x -= value
        elif dir == 2:
            y -= value
        else:
            x += value

    if not (0 <= y < M and 0 <= x < M):
        valid = False
        break

if valid:
    print(y, x)
else:
    print(-1)