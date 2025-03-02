import sys
input = lambda: sys.stdin.readline().rstrip()

N = int(input())
cards = map(int, input().split())
M = int(input())
nums = map(int, input().split())


sort_cards = sorted(cards)

def search(num):
    global sort_cards
    left = 0
    right = len(sort_cards) - 1
    
    while left <= right:
        mid = (left + right) // 2
        if sort_cards[mid] < num:
            left = mid + 1
        elif sort_cards[mid] > num:
            right = mid - 1
        else:
            return 1
    return -1


for num in nums:
    if search(num) == 1:
        print('1', end=' ')
    else:
        print('0', end=' ')
