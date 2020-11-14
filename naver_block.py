blocks = [[0, 92], [1, 20], [2, 11], [1, -81], [3, 98]]

def solution(blocks):
    answer = []
    dic = {}
    for i in range(len(blocks)):
        dic[i] = [blocks[i]]
    for j in range(len(blocks)):
        key_idx = dic[j][0][0]
        idx = 0
        if key_idx == 0:
            while len(dic[j]) != j+1:
                dic[j].append([key_idx +1, dic[j-1][key_idx][1]- dic[j][idx][1]])
                key_idx+=1
                idx +=1
        else:
            while len(dic[j]) != j+1:
                if key_idx == 0:
                    dic[j].sort()
                    idx = len(dic[j]) -1
                    key_idx = len(dic[j])
                    while len(dic[j]) != j+1:
                        dic[j].append([key_idx , dic[j-1][key_idx-1][1]- dic[j][idx][1]])
                        key_idx+=1
                        idx +=1
                else:
                    dic[j].append([key_idx-1, dic[j-1][key_idx-1][1]- dic[j][idx][1]])
                    key_idx -=1
                    idx -= 1
                
        dic[j].sort()
    
    for key in dic.keys():
        for l in range(len(dic[key])):
            answer.append(dic[key][l][1])
    return answer

print(solution(blocks))