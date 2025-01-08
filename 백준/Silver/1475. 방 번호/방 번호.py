from collections import Counter
import math

def min_sets(N):
    count = Counter(str(N))
    
    six_nine = count['6'] + count['9']
    
    count['6'] = count['9'] = math.ceil(six_nine / 2)
    
    return max(count.values())

N = int(input())
print(min_sets(N))
