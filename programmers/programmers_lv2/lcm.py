from math import gcd

arr = [2,6,8,14]

def lcm(x,y):
    return x * y //gcd(x,y)

def solution(arr):
    answer = 0
    for i in range(1, len(arr)):
        arr[i] = lcm(arr[i],arr[i-1])
    return arr[-1]

print(solution(arr))