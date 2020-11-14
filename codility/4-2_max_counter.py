def solution(N, A):
    dic = {i+1 :0 for i in range(N)}
    stack =[]
    for i in A:
        if i >N:
            m = max(dic.values())
            dic = {i+1: m for i in range(N)}
        else:
            dic[i] +=1
    for j in range(1, len(dic)+1):
        stack.append(dic[j])
    return stack

print(solution(5,[3,4,4,6,1,4,4]))