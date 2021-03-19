lines = ['2016-09-15 01:00:04.002 2.0s','2016-09-15 01:00:07.000 2s']
60 * 60
def solution(lines):
    timetonum = []
    answer = []
    # for i in lines:
    #     tmp = i.split(' ')
    #     tmp_time = tmp[1].split(':')
    #     tmp_second = tmp_time[2].split('.')
    #     time2 = (int(tmp_time[0]) *60*60 + int(tmp_time[1])*60 + int(tmp_second[0])) * 1000 + int(tmp_second[1])
    #     tmp[2] = tmp[2].replace('s','')
    #     if '.' in tmp[2]:
    #         tmp_second2 = tmp[2].split('.')
    #         time1 = time2 - int(tmp_second2[0])*1000 - int(tmp_second2[1])+1
    #     else:
    #         time1 = time2 - int(tmp[2])*1000 + 1
    for i in lines:
        lst = i.split(' ')
        end = lst[1]
        duration = lst[2]
    # print(end, duration)
        lst2= end.split(':')
        hour = int(lst2[0])*1000
        minu = int(lst2[1])*1000
        sec = int(lst2[2][0:2] + lst2[2][3:])
        micsec = hour*3600 + minu*60 + sec
        lst3 = duration[:-1].split('.')
        if len(lst3)>1:
            duration2 = int(lst3[0])*1000 + int(lst3[1]+('0'*(3-len(lst3[1]))))
        else: duration2 = int(lst3[0])*1000

        timetonum.append((micsec- duration2+1,micsec))
    # for i in range(len(timetonum)):
    #     cnt = 1
    #     for j in range(i+1,len(timetonum)):
    #         if timetonum[i][0] < timetonum[j][0] < timetonum[i][1]+1000:
    #             cnt+=1
    #     answer.append(cnt)
    # return max(answer)
    return timetonum
print(solution(lines))