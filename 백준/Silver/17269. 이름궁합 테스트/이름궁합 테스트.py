import sys
input = sys.stdin.readline

N, M = map(int, input().split())

A, B = list(map(str, input().split()))

def test(ans):
    if len(ans) <= 2:
        return ans

    result = []
    for i in range(1, len(ans)):
        result.append((ans[i - 1] + ans[i]) % 10)
        
    return test(result)


alph = {
    'A': 3, 'B': 2, 'C': 1, 'D': 2, 'E': 4, 'F': 3, 'G': 1, 'H': 3, 'I': 1,
    'J': 1, 'K': 3, 'L': 1, 'M': 3, 'N': 2, 'O': 1, 'P': 2, 'Q': 2, 'R': 2,
    'S': 1, 'T': 2, 'U': 1, 'V': 1, 'W': 1, 'X': 2, 'Y': 2, 'Z': 1
}
ans = []

min_len = min(N, M)
for i in range(min_len):
    ans.append(alph[A[i]])
    ans.append(alph[B[i]])

if N < M:
    ans.extend([alph[B[j]] for j in range(min_len, M)])
else:
    ans.extend([alph[A[j]] for j in range(min_len, N)])

final = test(ans)

if final[0] == 0:
    prob = str(final[1])
else:
    prob = str(final[0]) + str(final[1])

print(prob + '%')