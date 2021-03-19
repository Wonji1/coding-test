s = '(()('

def solution(s):
    answer = True
    cnt_l, cnt_r, i = 1, 0, 0
    for i in range(1,len(s)):
        if s[0] == ')':
            return False
        if cnt_l > cnt_r and s[i] == ')':
            cnt_r +=1
        elif cnt_l >= cnt_r and s[i] == '(':
            cnt_l +=1
        else:
            return False
    if cnt_l != cnt_r:
        return False
    return True

print(solution(s))