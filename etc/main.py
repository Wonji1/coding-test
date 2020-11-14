arr = [1,9,8,3,6,3,9,5,1,4,2]
def ssafy1(arr):
    answer = []
    for i in range(len(arr)-1):
        flag = False
        cnt = 1
        for j in range(i,len(arr)-1):
            if arr[j] < arr[j+1] and flag == False:
                cnt +=1
            elif arr[j] == arr[j+1]:
                cnt +=1
            elif arr[j] > arr[j+1]:
                flag = True
                cnt+=1
            elif flag ==True and arr[j] < arr[j+1]:
                break
        answer.append(cnt)
    return max(answer)
print(ssafy1(arr))