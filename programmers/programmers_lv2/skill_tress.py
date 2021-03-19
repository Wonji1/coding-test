def solution(skill, skill_trees):
    answer = 0
    for i in skill_trees:
        list =[]
        ck = True
        for j in range(len(i)):
            if i[j] in skill:
                list.append(i[j])
        for k in range(len(list)):
            if list[k] != skill[k]:
                ck = False
                break
        if ck == True:
            answer +=1
    return answer
