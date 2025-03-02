import sys

N = sys.stdin.readline()
n_list = list(map(int, sys.stdin.readline().split()))
M = sys.stdin.readline()
m_list = list(map(int, sys.stdin.readline().split()))

n_list.sort()

def binary_search(arr, target, low, high):
    while low <= high:
        mid = (low + high) // 2  
        if arr[mid] > target:  
            high = mid - 1
        elif arr[mid] < target:  
            low = mid + 1
        else:
            return True
    return False

for x in m_list:
    if binary_search(n_list, x, 0, len(n_list)-1):
        print('1', end=' ')
    else:
        print('0', end=' ')
