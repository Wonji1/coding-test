ball = [11, 2, 9, 13, 24]
order = [9, 2, 13, 24, 11]	

def solution(ball, order):
    answer, tmp = [],[]
    #del ball[0] 앞 
    #ball.pop() 뒤
    for i in range(len(order)):
        exist = True
        while exist:
            if ball[0] in tmp:
                answer.append(ball[0])
                del ball[0]
            elif ball[-1] in tmp:
                answer.append(ball[-1])
                ball.pop()
            else:
                exist = False
        if order[i] == ball[0]:
            answer.append(ball[0])
            del ball[0]
        elif order[i] == ball[-1]:
            answer.append(ball[-1])
            ball.pop()
        else:
            tmp.append(order[i])


    return answer

print(solution(ball, order))