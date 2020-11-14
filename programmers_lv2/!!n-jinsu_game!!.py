n,t,m,p = 16,16,2,2
Nums = "0123456789ABCDEF"

# 진법 구하기

def change(n,i):
    str1 = ""
    while n != 0:
        if n % i == 0:
            str1 += "0"
        else:
            str1 += str(Nums[n%i])
        n = n // i
    return(str1)[::-1]

def solution(n, t, m, p):
    answer = ''
    tmp = '0'
    cnt = 0
    for i in range(0,1000000):
        tmp += change(i,n)
    
    for j in range(p-1, len(tmp),m):
        answer += tmp[j]
        cnt +=1
        if cnt == t:
            break
    return answer

print(solution(n,t,m,p))