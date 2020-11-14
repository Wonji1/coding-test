day, width, blocks = 2, 6, [[6,2,11,0,3,5], [6,3,0,9,0,5]]
def solution(day,width,blocks):
    tmp = [0 for _ in range(width)]
    for i in range(day):
        for n in range(width):
            tmp[n] += blocks[i][n]
        for j in range(1, width-1):
            if tmp[j-1] > tmp[j] and tmp[j+1]>tmp[j]:
                if tmp[j-1] > tmp[j+1]:
                    tmp[j] = tmp[j+1]
                else:
                    tmp[j] = tmp[j-1]
            k = j-1
            while k>0:
                if tmp[j] < tmp[k]<tmp[j+1]:
                    tmp[j] = tmp[k]
                k -= 1

    return tmp

print(solution(day,width,blocks), 20)