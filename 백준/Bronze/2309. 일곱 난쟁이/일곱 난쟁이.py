n = 9
k = 0
l = 0

dwarfs = [int(input()) for _ in range(n)]

sorted_dw = sorted(dwarfs)
sum_dw = sum(dwarfs)

for i in range(n):
    for j in range(i+1, n):
        if sum_dw - sorted_dw[i] - sorted_dw[j] == 100:
            k = i
            l = j
            break
        
        

for i in range(n):
    if i == k or i == l:
        continue;
    print(sorted_dw[i])