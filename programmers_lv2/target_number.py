numbers, target = [1, 1, 1, 1, 1], 3

def solution(numbers, target):
    tmp =[0]
    for i in numbers:
        tmp2 =[]
        for j in tmp:
            tmp2.append(j + i)
            tmp2.append(j-i)
        tmp = tmp2
    return tmp.count(target)

print(solution(numbers,target))