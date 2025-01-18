import sys
input = sys.stdin.readline
from collections import deque

while True:
    arr = input().rstrip()

    if arr[0] == '.':
        break

    q = deque()
    is_valid = True 

    for i in arr:
        if i == '(' or i == '[':
            q.append(i)
        elif i == ')':
            if q and q[-1] == '(':
                q.pop()
            else:
                is_valid = False
                break
        elif i == ']':
            if q and q[-1] == '[':
                q.pop()
            else:
                is_valid = False
                break


    if is_valid and not q:
        print('yes')
    else:
        print('no')