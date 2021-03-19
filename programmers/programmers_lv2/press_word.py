s = "abcabcabcabcdededededede"

def solution(s):
    minlst = []
    if len(s) == 1:
        answer = 1
    else:
        for i in range(len(s)//2):
            jump, cnt = i+1 , 1
            rst =''
            for j in range(0,len(s), jump):
                tmp = s[j:j + jump]
                if tmp == s[j+ jump : j+ 2*jump]:
                    cnt += 1
                else:
                    if cnt == 1:
                        rst += tmp
                    else:
                        rst += tmp + str(cnt)
                        cnt = 1
            minlst.append(len(rst))

        answer = min(minlst)
        
    return answer

print(solution(s))