A = [1, 5, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2]
def solution(A):
    if len(A)<3:
        return 0
    peak =[]
    dis = 0
    ans_tmp = []
    for i in range(1,len(A)-1):
        dis +=1
        if A[i-1] < A[i] and A[i] > A[i+1]:
            peak.append(dis)
            dis = 0
    for j in range(len(peak), 0, -1):
        answer = 0
        tmp =  0
        for k in range(1,len(peak)):
            if peak[k] >=j:
                answer +=1
                tmp = 0
            else:
                if tmp+peak[k] >=j:
                    answer +=1
                    tmp = 0
                else:
                    tmp += peak[k]
        if answer >=j:
            ans_tmp.append(j)
        else:ans_tmp.append(answer)
    return max(ans_tmp)+1
print(solution(A))