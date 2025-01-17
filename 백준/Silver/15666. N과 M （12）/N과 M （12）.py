import sys
input = sys.stdin.readline

def nm(depth, start):
    if depth == M:
        anslist.add(tuple(ans))
        return
    
    for num in range(start, N):
        ans.append(sorted_arr[num])
        nm(depth + 1, num)
        ans.pop()

N, M = map(int, input().split())
arr = list(map(int,input().split()))

sorted_arr = sorted(arr)

ans = []
anslist = set()

nm(0, 0)

for seq in sorted(anslist):
    print(*seq)