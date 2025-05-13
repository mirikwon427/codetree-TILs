import sys
input = sys.stdin.readline

arr = list(map(int, input().split()))

MAX = 400001
dp = [[[MAX for _ in range(5)]for _ in range(5)] for _ in range(len(arr) + 1)]
dp[0][0][0] = 0

def power(before, after):
    if before == after:
        return 1
    elif before == 0:
        return 2
    elif abs(before + target) % 2 == 0:
        return 4
    else:
        return 3

for i in range(1, len(arr)):
    target = arr[i - 1]
    for left in range(5):
        for right in range(5):
            dp[i][target][right] = min(dp[i][target][right], dp[i - 1][left][right] + power(left, target))
            dp[i][left][target] = min(dp[i][left][target], dp[i - 1][left][right] + power(right, target))

ans = MAX
for i in range(5):
    for j in range(5):
        ans = min(ans, dp[len(arr) - 1][i][j])

print(ans)
