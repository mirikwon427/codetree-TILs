N = input()

sorted_N = sorted(N, reverse = True)
ans = sum(int(i) for i in sorted_N)

if '0' not in sorted_N:
    print(-1)
else:
    if ans % 3 == 0:
        print("".join(sorted_N))
    else:
        print(-1)