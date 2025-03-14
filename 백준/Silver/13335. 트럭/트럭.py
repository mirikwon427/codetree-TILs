import sys
input = sys.stdin.readline
from collections import deque

n, w, L = map(int, input().split())
trucks = list(map(int, input().split()))

bridge = deque([0] * w)
weight = 0
time = 0

for truck in trucks:
    while True:
        time += 1
        weight -= bridge.popleft()
        
        if weight + truck <= L:
            bridge.append(truck)
            weight += truck
            break
        else:
            bridge.append(0)

time += w

print(time)