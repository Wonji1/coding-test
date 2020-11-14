A = [1, 5, 2, 1, 4, 0]

def solution(A):
    dic = {}
    answer =0
    for i in range(len(A)):
        dic[i] = [i-A[i], i+A[i]]
    for i in range(len(A)):
        for j in range(i):
            if dic[i][0] < dic[j][1] < dic[i][1]:
                answer +=1
        for k in range(i+1, len(A)):
            if dic[i][0] < dic[k][0] < dic[i][1]:
                answer +=1
    return answer

print(solution(A))