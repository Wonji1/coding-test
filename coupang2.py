from collections import deque
n, costomers = 2, ["02/28 23:59:00 03","03/01 00:00:00 02", "03/01 00:05:00 01"]
month = {1 : 31, 2:28, 3:31, 4:30, 5:31, 6:30, 7:31, 8:31, 9:30, 10:31, 11:30, 12:31}

def time_num(s):
    cnt = 0
    for i in range(1, int(s[:2])):
        cnt += month[i]
    cnt += int(s[3:5])
    cnt = cnt *24*60*60 + int(s[6:8])*60*60 + int(s[9:11])*60 + int(s[12:14])
    return cnt 

def solution(n, costomers):
    answer = []
    dic ={i :0 for i in range(n)}
    kiosk =[[i,0]for i in range(n)]
    for i in range(len(costomers)):
        tn = time_num(costomers[i])
        taketime = int(costomers[i][15:])
        kiosk.sort(key = lambda x : x[1])
        for ki in range(len(kiosk)):
            if kiosk[ki][1] == 0:
                kiosk[ki][1] = tn + taketime *60
                dic[kiosk[ki][0]] += 1
                break
            elif kiosk[ki][1] <= tn:
                dic[kiosk[ki][0]] += 1
                kiosk[ki][1] = tn+taketime *60
                break
            elif kiosk[ki][1] > tn:
                kiosk[ki][1] += taketime *60
                dic[kiosk[ki][0]] += 1
                break

    for d in dic.keys():
        answer.append(dic[d])
    return max(answer)
    
print(solution(n,costomers))