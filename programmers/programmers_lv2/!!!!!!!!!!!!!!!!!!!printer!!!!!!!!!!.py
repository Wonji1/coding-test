priorities, location = [1, 1, 9, 1, 1, 1], 0	

from collections import deque

def solution(priorities, location):
    answer = 0
    d = deque([(v,i) for i, v in enumerate(priorities)])
    while d:
        item = d[0]
        if max(d)[0] > item[0]:
            item = d.popleft()
            d.append(item)
        else:
            d.popleft()
            answer += 1
            if item[1] == location:
                break
    return answer

print(solution(priorities, location))