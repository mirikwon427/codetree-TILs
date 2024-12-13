def dfs(y, x):
    global map, count, N

    if x < 0 or x >= N or y < 0 or y >= N:
        return False

    if map[y][x] == 1:
        count += 1
        map[y][x] = 0
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            dfs(ny, nx)
        return True
    return False


dx = [0, 1, 0, -1]
dy = [-1, 0, 1, 0]

N = int(input())
    
map = [list(map(int, input())) for _ in range(N)]

num = []
count = 0
result = 0

for y in range(N):
    for x in range(N):
        if dfs(y,x) == True:
            num.append(count)
            result += 1
            count = 0
            
sorted_num = sorted(num)

print(result)
for i in range(len(sorted_num)):
    print(sorted_num[i])
