def start(n):
    if n == 3:
        return ['***', '* *', '***']
    
    pattern = start(n // 3)
    patterns = []
    
    for row in pattern:
        patterns.append(row * 3)
    for row in pattern:
        patterns.append(row + " " * (n // 3) + row)
    for row in pattern:
        patterns.append(row * 3)
    
    return patterns  
        
N = int(input())
result = start(N)
for row in result:
    print(row)