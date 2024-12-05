K, N = map(int, input().split())

lans = [int(input()) for _ in range(K)]

sorted_lans = sorted(lans)

start, end = 1, max(lans)

while start <= end:
	sum = 0
	mid = (start + end) // 2
	for lan in sorted_lans:
		sum += (lan // mid)
	if sum < N:
		end = mid - 1
	else:
		start = mid + 1

print(start - 1)