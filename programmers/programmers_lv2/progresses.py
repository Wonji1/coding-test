progresses, speeds = [95, 90, 99, 99, 80, 99], [1, 1, 1, 1, 1, 1]	

def solution(progresses, speeds):
    answer = []
    for i in range(len(progresses)):
        if (100-progresses[i]) % speeds[i] == 0:
            progresses[i] = (100 - progresses[i]) // speeds[i]
        else:
            progresses[i] = (100 - progresses[i]) // speeds[i] +1
    while progresses:
        cnt = 1
        tmp = progresses.pop(0)
        if not progresses:
            answer.append(cnt)
            break
        for i in range(len(progresses)):
            if tmp >= progresses[i]:
                cnt +=1
            else: break 
        answer.append(cnt)
        progresses = progresses[cnt-1:]
                
    return answer

print(solution(progresses,speeds))