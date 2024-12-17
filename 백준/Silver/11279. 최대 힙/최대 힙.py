import heapq
import sys
input = sys.stdin.readline

N = int(input())
heap = []

for _ in range(N):
    num = int(input())
    
    if num == 0:
        if len(heap) <= 0:
            print(0)
        else:
            print_num = heapq.heappop(heap)[1]
            print(print_num)
    else:
        heapq.heappush(heap, (-num, num))