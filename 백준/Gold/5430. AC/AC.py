import sys
from collections import deque
input = lambda: sys.stdin.readline().rstrip()

T = int(input())

for _ in range(T):
    p = input()
    n = int(input())
    x = input().strip()

    if x == "[]":
        arr = deque()
    else:
        arr = deque(map(int, x[1:-1].split(',')))

    is_reversed = False
    error_flag = False

    for command in p:
        if command == 'R':
            is_reversed = not is_reversed
        elif command == 'D':
            if not arr:
                print("error")
                error_flag = True
                break
            if is_reversed:
                arr.pop()
            else:
                arr.popleft()

    if not error_flag:
        if is_reversed:
            print("[" + ",".join(map(str, reversed(arr))) + "]")
        else:
            print("[" + ",".join(map(str, arr)) + "]")
