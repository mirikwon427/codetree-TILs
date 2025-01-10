N = int(input()) 

for _ in range(N):
    M = int(input())

    schools = {}

    for _ in range(M):
        name, score = input().split()
        score = int(score)

        if name in schools:
            schools[name] += score
        else:
            schools[name] = score

    best = max(schools, key = schools.get)
    print(best)