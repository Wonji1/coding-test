s = '3people unFollowed me'	

def solution(s):
    answer = ''
    tmp = s.split(' ')
    tmp2 = []
    for i in tmp:
        i = i.lower()
        i = i.capitalize()
        tmp2.append(i)
    return ' '.join(tmp2)

print(solution(s))