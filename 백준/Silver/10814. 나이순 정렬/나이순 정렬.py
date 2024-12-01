N = int(input())

members = [input().split() for _ in range(N)]

members = [(int(age), name) for age, name in members]

sorted_members = sorted(members, key=lambda x: x[0])

for age, name in sorted_members:
    print(age, name)