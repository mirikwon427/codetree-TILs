import sys
input = sys.stdin.readline

N = int(input())

for _ in range(N):
    stack = []
    is_valid = True
    
    command = input().strip()
    
    for char in command:
        if char == "(":
            stack.append(char)
        else:
            if stack:
                stack.pop()
            else:
                is_valid = False
                break;
                
    if is_valid and not stack:
        print("YES")
    else:
        print("NO")