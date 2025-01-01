import sys
input = sys.stdin.readline

N, M, B = map(int, input().split())
matrix = [list(map(int, input().split())) for _ in range(N)]

min_time = sys.maxsize
result_high = 0

for high in range(257):
    minus_b = 0
    plus_b = 0
    
    for y in range(N):
        for x in range(M):
            cur_h = matrix[y][x]
            if cur_h > high:
                minus_b += (cur_h - high)
            else:
                plus_b += (high - cur_h)
                
    if minus_b + B >= plus_b:
        time = minus_b * 2 + plus_b
        if time <= min_time:
            min_time = time
            result_high = high
            
print(min_time, result_high)            