a = 	[-16, 27, 65, -2, 58, -92, -71, -68, -61, -33]
def solution(a):
    tmp =[[0 for _ in range(2)]for _ in range(len(a))]
    left = a[0]
    right = a[-1]
    cnt = 0
    for i in range(len(a)):
        if left < a[i]:
            tmp[i][0]=1
        else:
            left = a[i]
    for i in range(len(a)-2,-1,-1):
        if right < a[i]:
            tmp[i][1]=1
        else:
            right = a[i]
    for i in range(len(tmp)):
        if tmp[i][0] != 1 or tmp[i][1] !=1:
            cnt +=1
    return cnt

print(solution(a))