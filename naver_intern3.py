A =[1,2,5,4,10,11,19,16]
def solution(A):
    answer = 0
    while A:
        i =0
        m =A[0]
        for j in range(i,len(A)):
            if A[j] < m:
                i = j
                m = max(A[:i+1])
        A = A[i+1:]
        answer+=1
    return answer

print(solution(A))