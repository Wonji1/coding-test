clothes = [['yellow_hat', 'headgear'], ['blue_sunglasses', 'eyewear'], ['green_turban', 'headgear']]

# 딕셔너리 사용법
def solution(clothes):
    answer = 1
    dic = {}
    for i in clothes:
        key = i[1]
        value = i[0]
        if key in dic:
            dic[key].append(value)
        else:
            dic[key] = [value]
    for key in dic.keys():
        answer *= len(dic[key])+1
        
    return answer-1

print(solution(clothes))