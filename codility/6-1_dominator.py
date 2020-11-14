A = [3, 4, 3, 2, 3, -1, 3, 3]
def solution(A):
    dic = {}
    for i,v in enumerate(A):
        if v not in dic:
            dic[v] =[i]
        else:
            dic[v].append(i)
    for i in dic.keys():
        if len(dic[i]) > len(A)/2:
            return dic[i][0]
    return -1

print(solution(A))