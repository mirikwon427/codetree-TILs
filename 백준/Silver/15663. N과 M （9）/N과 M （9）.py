import sys
input = lambda: sys.stdin.readline().rstrip()

def nm(depth):
    if depth == M:
        anslist.add(tuple(ans))
        return

    for num in range(N):
        if not visited[num]:
            ans.append(sorted_arr[num])
            visited[num] = True
            nm(depth + 1)
            visited[num] = False
            ans.pop()

N, M = map(int, input().split())
arr = list(map(int, input().split()))

sorted_arr = sorted(arr)

ans = []
anslist = set()
visited = [False] * N

nm(0)

for seq in sorted(anslist):
    print(*seq)