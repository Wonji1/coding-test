record = ["Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"]

def solution(record):
    answer = []
    tmp =[]
    dic ={}
    for i in range (len(record)):
        record[i] = record[i].split(' ')
        if record[i][1] not in dic:
            dic[record[i][1]] = record[i][2]
        else:
            if record[i][0] == 'Enter':
                dic[record[i][1]] = record[i][2]
        if record[i][0] != 'Change':
            tmp.append((record[i][0], record[i][1]))
        else:
            dic[record[i][1]] = record[i][2]
    for j in tmp:
        if j[0] == 'Enter':
            answer.append(dic[j[1]] + '님이 들어왔습니다.')
        else:
            answer.append(dic[j[1]]+'님이 나갔습니다.')
    return answer

print(solution(record))