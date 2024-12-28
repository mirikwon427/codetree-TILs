import sys
input = lambda: sys.stdin.readline().rstrip()
sys.setrecursionlimit(int(1e6))

def z(N, r, c):
	result = 0
	size = 2**N

def z(N, r, c):
    result = 0
    size = 2**N

    while N > 0:
        half = size // 2

        if r < half and c < half:
            quad = 0
        elif r < half and c >= half:
            quad = 1
            c -= half
        elif r >= half and c < half:
            quad = 2
            r -= half
        else:
            quad = 3
            r -= half
            c -= half

        result += quad * (half * half)

        size //= 2
        N -= 1
    
    return result

N, r, c = map(int, input().split())

print(z(N, r, c))