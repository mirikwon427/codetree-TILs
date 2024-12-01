N = int(input())

numbers = [int(input()) for _ in range(N)]

numbers = sorted(numbers)

for number in numbers:
    print(number)


