import sys
input = sys.stdin.readline

def find(leader, num):
    if leader[num] != num:
        leader[num] = find(leader, leader[num])
    return leader[num]

def union(leader, depth, a, b):
    root_a = find(leader, a)
    root_b = find(leader, b)
    
    if root_a != root_b:
        if depth[root_a] < depth[root_b]:
            leader[root_b] = root_a
        elif depth[root_a] > depth[root_b]:
            leader[root_a] = root_b
        else:
            leader[root_b] = root_a
            depth[root_a] += 1

N, M = map(int, input().split())
true = list(map(int, input().split()))
true_nums = true[1:]

nums_list = []
leader = [i for i in range(N + 1)]
depth = [0] * (N + 1)

for _ in range(M):
    party = list(map(int, input().split()))
    count = party[0]
    nums = party[1:]

    nums_list.append(nums)

    for i in range(1, count):
        union(leader, depth, nums[0], nums[i])
        
true_roots = set(find(leader, t) for t in true_nums)

ans = 0
for nums in nums_list:
    if all(find(leader, n) not in true_roots for n in nums):
        ans += 1
        
print(ans)