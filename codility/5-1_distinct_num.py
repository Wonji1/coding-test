A =[2, 1, 1, 2, 3, 1]
def solution(A):
    A.sort()
    i = 0
    while True:
        flag = False
        while i != len(A):
            try:
                if A[i] != A[i+1] and flag == False:
                    return A[i+1]
                elif A[i] == A[i+1]:
                    flag = True
                    i +=1
                elif A[i] != A[i+1] and flag == True:
                    i +=1
                    break
            except:
                return A[-1]
print(solution(A))
            