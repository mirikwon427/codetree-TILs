N, K = map(int, input().split())

ans = [N]

while True:
    current = ans[-1]
    num = sum(int(digit) ** K for digit in str(current))
    
    if num in ans:
        print(ans.index(num))
        break
    else:
        ans.append(num)


