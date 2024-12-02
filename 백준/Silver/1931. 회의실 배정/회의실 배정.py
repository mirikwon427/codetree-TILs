N = int(input())
prev_end = 0
cnt = 0

time = [tuple(map(int, input().split())) for _ in range(N)]

sorted_time = sorted(time, key=lambda x : (x[1], x[0]))

for start, end in sorted_time:
    if start >= prev_end:
        cnt += 1
        prev_end = end
    
print(cnt)           