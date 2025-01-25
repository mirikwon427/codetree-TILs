N = int(input())
MOD = 15746

if N == 1:
    print(1)
    exit()
elif N == 2:
    print(2)
    exit()

prev2 = 1
prev1 = 2

for i in range(3, N + 1):
    current = (prev1 + prev2) % MOD
    prev2 = prev1
    prev1 = current

print(prev1)
