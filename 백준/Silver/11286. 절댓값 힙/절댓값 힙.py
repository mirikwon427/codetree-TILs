import heapq
import sys
input = sys.stdin.readline

N = int(input())

q = []

for _ in range(N):
    num = int(input())

    if num != 0:
        heapq.heappush(q, (abs(num), num))
    else:
        if not q:
            print(0)
        else:
            print(heapq.heappop(q)[1])