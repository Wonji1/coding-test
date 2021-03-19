from itertools import permutations
from math import sqrt

numbers = "011"

def is_prime(num):
    if num <= 1:
        return False
    for i in range(2,int(sqrt(num)+1)):
        if num % i == 0:
            return False
    return True

def solution(numbers):
    answer = []

    for k in range(1, len(numbers)+1):
        pm = list(map(''.join, permutations(list(numbers), k)))
        for j in set(pm):
            if is_prime(int(j)):
                answer.append(int(j))
    return len(set(answer))

print(solution(numbers))