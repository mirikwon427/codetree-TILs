import sys
input = sys.stdin.readline

from queue import PriorityQueue

N = int(input())

q = PriorityQueue()

for _ in range(N):
    k = int(input())
    
    if k == 0:
        if not q.empty():
            print(q.get())
        else:
            print(0)
    else:
        q.put(k)