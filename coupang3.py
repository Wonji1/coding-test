k, score = 3, [24,22,20,10,5,3,2,1]

def solution(k,score):
    answer = 0
    dic ={}
    cnt = 0
    for i in range(1, len(score)):
        gap = score[i-1] - score[i]
        if gap not in dic.keys():
            dic[gap] = [1,0,i]
        else:
            if dic[gap][2] +1 == i:
                dic[gap][1] +=1
                dic[gap][2] = i
                cnt +=1
            dic[gap][0] += 1
    for d in dic:
        if dic[d][0] >= k:
            answer = answer + dic[d][0] *2 - cnt
        else:
            answer += dic[d][1]
    return len(score) - answer

print(solution(k,score))