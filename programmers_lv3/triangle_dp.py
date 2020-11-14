triangle = [[7], [3, 8], [8, 1, 0], [2, 7, 4, 4], [4, 5, 2, 6, 5]]

def solution(triangle):

    for i in range(len(triangle)-1):
        tmp = triangle[i+1][0]
        for j in range(i+1):
            if tmp + triangle[i][j] > triangle[i+1][j]:
                triangle[i+1][j] = tmp +triangle[i][j]
            tmp = triangle[i+1][j+1]
            triangle[i+1][j+1] += triangle[i][j]
    
    return max(triangle[-1])

print(solution(triangle))