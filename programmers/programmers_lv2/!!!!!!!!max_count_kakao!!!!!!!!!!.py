from itertools import permutations
import re

expression = "100-200*300-500+20"

def solution(expression):
    # \D 특수기호 \d 숫자
    expressions = set(re.findall("\D", expression))
    # 겹치지 않는 조합
    prior = permutations(expressions)
    candidate = []

    for exps in prior:
        temp = re.compile("(\D)").split('' + expression)    # 특수기호를 기준으로 잘라서 list
        for exp in exps:
            while exp in temp:
                idx = temp.index(exp)
                temp = temp[:idx-1] + [str(eval(''.join(temp[idx-1:idx+2])))] + temp[idx+2:]
        candidate.append(abs(int(temp[0])))
    return max(candidate)

print(solution(expression))