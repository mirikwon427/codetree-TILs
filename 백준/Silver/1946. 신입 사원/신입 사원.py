import sys

input = sys.stdin.readline

T = int(input())

for i in range(T):
	N = int(input())
	test = [list(map(int, input().split())) for _ in range(N)]

	sorted_test = sorted(test, key=lambda x : x[0])

	cnt = 1
	maxRank = sorted_test[0][1]

	for j in range(1,N):
		if sorted_test[j][1] < maxRank:
			maxRank = sorted_test[j][1]
			cnt += 1

	print(cnt)