m, k = 'aacbbcccdc', 'aacbbcccd' 

def solution(m,k):
    answer =''
    list_m = list(m)
    tmp = []
    for i in range(len(k)):
        idx = list_m.index(k[i])
        list_m.remove(k[i])
        tmp = list_m[:idx]
        list_m = list_m[idx:]
        answer += ''.join(tmp)
    answer += ''.join(list_m)
        
    return answer

print(solution(m,k))