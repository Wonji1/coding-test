m,n,puddles = 	4, 3, [[2, 2]]
def solution(m, n, puddles):
    answer = 0
    mn = [[0]*(m+1) for _ in range(n+1)]
    for i in range(1,n+1):
        for j in range(1,m+1):
            if i == 1 and j ==1:
                mn[i][j] = 1
                continue
            if [j,i] in puddles:
                mn[i][j] = 0
            else:
                mn[i][j] = mn[i-1][j] + mn[i][j-1]
    return answer

print(solution(m,n,puddles))