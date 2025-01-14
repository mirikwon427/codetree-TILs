import sys
input = lambda: sys.stdin.readline().rstrip()
from queue import PriorityQueue
INF = int(1e12)

N = int(input())
M = int(input())

adj_list = [[] * (N + 1)  for _ in range(N + 1)]
dist = [INF] * (N + 1)

for _ in range(M):
    a, b, c = map(int, input().split())

    adj_list[a].append([b, c])

A, B = map(int, input().split())

pq = PriorityQueue()
pq.put([0, A])
dist[0] = 0

while not pq.empty():
    cur_dist, cur_node = pq.get()

    if cur_dist > dist[cur_node]:
        continue

    for adj_node, adj_dist in adj_list[cur_node]:
        temp_dist = cur_dist + adj_dist
        if temp_dist < dist[adj_node]:
            dist[adj_node] = temp_dist
            pq.put([temp_dist, adj_node])

print(dist[B])