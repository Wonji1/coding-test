# cpp, java, python, -
# backend, frontend, -
# junior, senior, -
# chicken, pizze, - 
# ["java backend junior pizza 150","python frontend senior chicken 210"]
# ["java and backend and junior and pizza 100","python and frontend and senior and chicken 200"]


def ck(inf,qu):
    answ = list()
    for i in range(len(qu)):
        ans= 0
        query_tmp = qu[i].split(' ')
        query_tmp.remove('and')
        for j in range(len(inf)):
            info_tmp = inf[j].split(' ')
            if (query_tmp[0] == info_tmp[0] or query_tmp[0] == '-') and (query_tmp[1] == info_tmp[1] or query_tmp[1] == '-') and (query_tmp[2] == info_tmp[2] or query_tmp[2] == '-') and (query_tmp[3] == info_tmp[3] or query_tmp[3] == '-') and (info_tmp[4] >= query_tmp[4]):
                ans +=1
        answ[i] = ans
    
    return answ

def solution(info, query):
    answer = []
    answer = ck(info,query)
    
    return answer