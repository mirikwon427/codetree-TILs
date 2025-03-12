import sys
input = sys.stdin.readline

def get_strike_ball(candidate, guess):
    candidate_str = str(candidate)
    guess_str = str(guess)
    strike = 0
    ball = 0
    
    for i in range(3):
        if candidate_str[i] == guess_str[i]:
            strike += 1
    
    for digit in guess_str:
        if digit in candidate_str:
            ball += 1
    ball -= strike
    return strike, ball


N = int(input())
guesses = []
count = 0

for _ in range(N):
    guess, s, b = map(int, input().split())
    guesses.append((guess, s, b))


for num in range(123, 988): 
    num_str = str(num)
    
    if '0' in num_str or len(set(num_str)) != 3:
            continue  
        
    valid = True

    for guess, s, b in guesses:
        strike, ball = get_strike_ball(num, guess)
        if strike != s or ball != b:
            valid = False
            break
    if valid:
        count += 1

print(count)