N = int(input())

for _ in range(N):
    a, b = map(int, input().split())
    
    if a == 0 or b == 0:
        print(0)
        break;
    
    c, d = a, b
    
    while d != 0:
        c, d = d, c % d
    
    ans = a * b // c
    
    print(ans)