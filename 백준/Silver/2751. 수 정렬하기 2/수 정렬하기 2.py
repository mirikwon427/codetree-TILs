import sys

input = sys.stdin.read
output = sys.stdout.write


data = input().splitlines()
N = int(data[0])
numbers = list(map(int, data[1:N + 1]))

sorted_numbers = sorted(numbers)

output('\n'.join(map(str, sorted_numbers)) + '\n')
