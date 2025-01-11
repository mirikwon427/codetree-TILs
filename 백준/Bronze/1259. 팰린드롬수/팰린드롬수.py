while True:
    N = input()

    if N == '0':
        break

    isPalindrome = True

    for i in range(len(N) // 2):
        if N[i] != N[len(N) - 1 - i]:
            isPalindrome = False
            break

    if isPalindrome:
        print('yes')
    else:
        print('no')