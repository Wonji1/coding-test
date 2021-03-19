number, k = '4177252841',	4

def solution(number, k):
    answer = ''
    num = len(number[:len(number)-k])
    number = list(number)
    tmp = number[:k]
    a= 0
    for i in range(len(number)-k):
        tmp.append(number[k+i])
        answer += max(tmp)
        a =tmp.index(max(tmp))
        tmp = tmp[a+1:]
        
    return answer
print(solution(number,k))