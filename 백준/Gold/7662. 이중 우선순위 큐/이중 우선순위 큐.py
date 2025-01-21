import heapq
import sys
input = sys.stdin.readline

T = int(input())

for _ in range(T):
    K = int(input())
    min_heap = []
    max_heap = []
    visited = [False] * 1000001

    for i in range(K):
        command, num = input().split()
        num = int(num)

        if command == 'I':
            heapq.heappush(min_heap, (num, i))
            heapq.heappush(max_heap, (-num, i))
            visited[i] = True
        else:
            if num == 1:
                while max_heap and not visited[max_heap[0][1]]:
                    heapq.heappop(max_heap)
                if max_heap:
                    _, idx = heapq.heappop(max_heap)
                    visited[idx] = False
            else:
                while min_heap and not visited[min_heap[0][1]]:
                    heapq.heappop(min_heap)
                if min_heap:
                    _, idx = heapq.heappop(min_heap)
                    visited[idx] = False

    while min_heap and not visited[min_heap[0][1]]:
        heapq.heappop(min_heap)
    while max_heap and not visited[max_heap[0][1]]:
        heapq.heappop(max_heap)

    if not min_heap or not max_heap:
        print('EMPTY')
    else:
        print(-max_heap[0][0], min_heap[0][0])
