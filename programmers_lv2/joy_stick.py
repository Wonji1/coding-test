name = 'BBBAAAB'

def solution(name):
    answer = 0

    for i in range(len(name)):
        ord_name = ord(name[i])
        if ord_name <=77:
            answer += ord_name - 65
        else:
            answer += 90 - ord_name +1
        answer +=1
    if name[1] == 'A':
        answer -= 1
    return answer -1


print(solution(name))