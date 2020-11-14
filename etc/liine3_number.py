n = 10007

def solution(n):
    answer = []
    plus1, plus2 ='', ''
    n = str(n)
    answer.append(len(n)-1)
    tmp = [0 for _ in range(len(n)-1)]
    while  len(n) != 1:
        for i in range(len(n)-1):
            plus1,plus2 = n[:i+1] ,n[i+1:]
            tmp[i] = int(plus1) + int(plus2)
        n = str(min(tmp))
    
    answer.append(int(n))
    return answer


print(solution(n))