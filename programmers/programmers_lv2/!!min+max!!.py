s = '-1 -2 -3 -4'

def solution(s):
    answer = ''
    # 분할
    a = s.split(' ')
    # str --> int 로
    a = list(map(int, a))
    # -4 값 sort 가능
    a.sort()
    return str(min(a)) + ' '+ str(max(a))

print(solution(s))