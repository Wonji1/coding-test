N = 10

# N진수 변환
def change(n,i):
    Nums = "012345678"
    str1 = ""
    while n != 0:
        if n % i == 0:
            str1 += "0"
        else:
            str1 += str(Nums[n%i])
        n = n // i
    return(str1)[::-1]
    
def solution(N):
    number= []
    for i in range(2,10):
        multi = 1
        # 0 제거
        no_zero = change(N,i).replace('0','')
        for i in range(len(no_zero)):
            multi *= int(no_zero[i])
        number.append(multi)
    # 뒤를 max로 하기위해
    number = number[::-1]
    
    return [9- number.index(max(number)), max(number)]

print(solution(N))