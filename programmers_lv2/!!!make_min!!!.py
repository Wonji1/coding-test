A, B = [1, 4, 2], [5, 4, 4]

# 높은 값 * 높은 값 + 작은 값 * 작은 값 >= 작은 값 * 높은 값 + 높은 값 * 작은 값
# zip() --> [(1,5), (4,4), (2,4)]
def solution(A,B):
    answer = 0
    A.sort()
    B.sort(reverse = True)

    answer = sum( a* b for a,b in zip(A,B))
    return answer

print(solution(A,B))