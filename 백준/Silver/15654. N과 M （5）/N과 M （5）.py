import sys
input = lambda: sys.stdin.readline().rstrip()

def nm(start):
    if len(ans) == M:
        print(*ans)
        return
    start = 1
    for num in range(start, N + 1):
        if visited[num - 1] == False:
            ans.append(sort_arr[num - 1])
            visited[num - 1] = True
            nm(num)
            visited[num - 1] = False
            ans.pop()

N, M = map(int, input().split())

arr = list(map(int, input().split()))

sort_arr = sorted(arr)

ans = []
visited = [False] * N

nm(1)