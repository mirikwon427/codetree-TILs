while True:

    a, b, c = map(int, input().split())

    if a == 0 and b == 0 and c == 0:
        break

    lengths = sorted([a, b, c])

    if lengths[0]**2 + lengths[1]**2 == lengths[2]**2:
        print("right")
    else:
        print("wrong")
