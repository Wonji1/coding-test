from itertools import combinations
from math import sqrt

nums = [1,2,3,4]

def is_prime(i):
    for j in range(2, int(sqrt(i))+1):
        if i % j ==0:
            return 0
    return 1

def solution(nums):
    answer = 0
    t = []
    num3 = combinations(nums,3)
    for n in num3:
        t.append (n[0] + n[1] + n[2])
    for i in t:
        if is_prime(i) == 1:
            answer+=1
    return answer

print(solution(nums))