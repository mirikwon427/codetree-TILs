def mod(a, b, c):
    if b == 0:
        return 1
    if b == 1:
        return a % c

    half = mod(a, b // 2, c)
    half = (half * half) % c

    if b % 2 == 1:
        half = (half * a) % c

    return half

A, B, C = map(int, input().split())
result = mod(A, B, C)
print(result)