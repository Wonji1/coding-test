begin,target,words = 'hit','hhh',['hhh', 'hht']
from collections import deque
def one_dif(x,y,dic):
    cnt = 0
    for a,b in zip(x,y):
        if a==b:
            cnt +=1
    if cnt == 2:
        dic.setdefault(x,[]).append(y)
    return dic

def solution(begin, target, words):
    dic = {}
    for i in words:
        one_dif(begin,i,dic)
        for j in words:
            one_dif(i,j,dic)
    q = deque([[begin,0]])
    while q:
        w,lev = q.popleft()
        if lev>len(words):
            return 0
        for i in dic[w]:
            if i == target:
                return lev+1
            else:
                q.append([i,lev+1])
    return 0

print(solution(begin,target,words))