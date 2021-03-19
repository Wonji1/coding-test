msg = 'KAKAO'
64
def solution(msg):
    answer = []
    dic = {chr(e + 64): e for e in range(1, 27)}
    cnt = 27
    while msg:
        for i in range(len(msg),0,-1):
            if msg[:i] in dic.keys() and msg[:i] != msg:
                dic[msg[:i+1]] = cnt
                cnt+=1
                answer.append(dic[msg[:i]])
                msg = msg.replace(msg[:i],'',1)
                break
            elif msg[:i] in dic.keys() and msg[:i] == msg:
                answer.append(dic[msg[:i]])
                msg = msg.replace(msg[:i],'',1)
                break

                
                
    return answer

print(solution(msg))