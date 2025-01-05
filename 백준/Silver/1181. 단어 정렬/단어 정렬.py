N = int(input())

words = set()

for _ in range(N):
    word = input()
    words.add(word)

sort_words = sorted(words, key=lambda x: (len(x), x))

for word in sort_words:
    print(word)