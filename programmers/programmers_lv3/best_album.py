genres,plays = ['classic', 'pop', 'classic', 'classic'],	[500, 600, 500, 800]

def solution(genres, plays):
    ans = []
    dic , to_dic = {},{}
    for i in range(len(genres)):
        if genres[i] not in dic:
            dic[genres[i]] = [[plays[i],i]]
            to_dic[genres[i]] = plays[i]
        else:
            dic[genres[i]].append([plays[i],i])
            to_dic[genres[i]] += plays[i]
    for i in dic:
        dic[i].sort(key=lambda x : (x[0],-x[1]))
    for _ in dic:
        mx = max(to_dic, key=to_dic.get)
        print(mx)
        if len(dic[mx]) ==1:
            ans.append(dic[mx][-1][1])
            del to_dic[mx]
        else:
            ans.append(dic[mx][-1][1])
            ans.append(dic[mx][-2][1])
            del to_dic[mx]
    print(dic)
    return ans

print(solution(genres,plays))