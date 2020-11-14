N = 1041
def solution(N):
    # write your code in Python 3.6
    cnt_1, cnt_0 = 0,0
    max = 0
    flag = False
    N = format(N,'b')
    for i,n in enumerate(N):
        if n == '1':
            cnt_1 +=1
            if cnt_1 >=2 and cnt_0 >=1:
                flag = True
            if max < cnt_0:
                max = cnt_0
            cnt_0 = 0
            if cnt_1 >=2:cnt_1 = 1
        else:
            cnt_0 +=1
    if flag == True:
        return max
    else:
        return 0
print(solution(N))