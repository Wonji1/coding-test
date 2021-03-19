
# deque 를 통해 stack 최대 크기 지정
def solution(cacheSize, cities):
    import collections
    # deque 를 통해 stack 최대 크기 지정
    cache = collections.deque(maxlen=cacheSize)
    time = 0
    for i in cities:
        s = i.lower()
        if s in cache:
            cache.remove(s)
            cache.append(s)
            time += 1
        else:
            cache.append(s)
            time += 5
    return time