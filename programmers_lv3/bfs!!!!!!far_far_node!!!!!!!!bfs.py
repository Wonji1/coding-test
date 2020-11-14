n, edge = 	6, [[3, 6], [4, 3], [3, 2], [1, 3], [1, 2], [2, 4], [5, 2]]
from collections import deque

def solution(n, edge):
    dic ={}
    for a,b in edge:
        dic.setdefault(a,[]).append(b) 
        dic.setdefault(b,[]).append(a)
    q = deque([[1,0]])
    bfs = [-1 for _ in range(n+1)]
    while q:
        idx, width = q.popleft()
        bfs[idx] = width
        for i in dic[idx]:
            if bfs[i] == -1:
                bfs[i] =0
                q.append([i,width+1])
    return bfs.count(max(bfs))
        
    
print(solution(n,edge))