from itertools import combinations
A = [10, 50, 5, 1]
def solution(A):
    AA = combinations(A,3)
    for i in AA:
        if (i[0] + i[1]) <= i[2]:
            continue
        if (i[1] + i[2]) <= i[0]:
            continue
        if (i[2] + i[0]) <= i[1]:
            continue
        return 1
    return 0

print(solution(A))