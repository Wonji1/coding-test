import math
w, h = 12, 8

def solution(w,h):
    answer = 1
    gcd = math.gcd(w,h)

    gw,gh = w//gcd, h//gcd

    answer = w*h - ((gw+gh-1) * (gcd))

    return answer

print(solution(w,h))