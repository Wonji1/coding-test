X,A  = 5, [1,3,1,4,2,3,5,4]

def solution(X, A):
    a = set()
    for i in range(len(A)):
        a.add(A[i])
        if 1 in a and X in a and len(a) == X:
            return i
    return -1

print(solution(X,A))