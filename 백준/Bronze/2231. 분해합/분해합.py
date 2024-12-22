N = int(input().strip())

digits = len(str(N))

start = max(1, (N - (9 * digits)))

for i in range(start, N):
    digit_sum = i + sum(int(d) for d in str(i))
    
    if digit_sum == N:
        print(i)
        break
else:
    print(0)