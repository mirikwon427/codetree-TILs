def solution(friends, gifts):
    answer = 0
    next = {friend: 0 for friend in friends}
    index = {friend: 0 for friend in friends}
    tracker = {friend: {other: 0 for other in friends} for friend in friends}

    for gift in gifts:
        sender, receiver = gift.split()
        tracker[sender][receiver] += 1
        index[sender] += 1
        index[receiver] -= 1


    for friend in friends:
        sender = friend
        for friend in friends:
            receiver = friend
            if tracker[sender][receiver] != 0 and tracker[sender][receiver] > tracker[receiver][sender]:
                next[sender] += 1
            if tracker[sender][receiver] == tracker[receiver][sender] and index[sender] > index[receiver]:
                next[sender] += 1

    answer = max(next.values())

    return answer