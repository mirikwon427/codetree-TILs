import sys
input = sys.stdin.readline

N = 19
matrix = [list(map(int, input().split())) for _ in range(N)]

dy = [1, 0, 1, -1]
dx = [1, 1, 0, 1]

def check(y, x):
    stone = matrix[y][x]

    for i in range(4):
        prev_y = y - dy[i]
        prev_x = x - dx[i]
        if 0 <= prev_y < N and 0 <= prev_x < N and matrix[prev_y][prev_x] == stone:
            continue

        count = 1
        ny = y + dy[i]
        nx = x + dx[i]
        while 0 <= ny < N and 0 <= nx < N and matrix[ny][nx] == stone:
            count += 1
            ny += dy[i]
            nx += dx[i]

        if count == 5:
            return (y, x, stone)

    return None

ans = None

for y in range(N):
    for x in range(N):
        if matrix[y][x] != 0:
            result = check(y, x)
            if result:
                ans = result
                break
    if ans:
        break

if ans:
    ans_y, ans_x, stone = ans
    print(stone)
    print(ans_y + 1, ans_x + 1)
else:
    print(0)