people, limit= [70, 50, 80, 50], 100

def solution(people, limit):
    answer = 0
    people.sort()
    while len(people) >=2:
        if people[0] + people[-1] <=limit:
            del people[0], people[-1]
            answer += 1
        else:
            del people[-1]
            answer +=1
    if len(people) == 1: answer += 1
    return answer

print(solution(people,limit))