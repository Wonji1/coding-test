A = [1, 3, 6, 4, 1, 2, -1, 10, 12]
def solution(A):
    A = list(set(A))
    A.sort()
    j = 1
    if 1 in A:
        A =  A [A.index(1):]
        if A[-1] == len(A):
            return len(A)+1
        for i in A:
            if i != j:
                return j
            j+=1
    else:
        return 1
print(solution(A))