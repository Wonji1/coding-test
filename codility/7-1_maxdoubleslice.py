A = [3,2,6,-1,4,5,-1,2]

def solution(A):
    leftMaxSum = [0] * len(A)
    rightMaxSum = [0] * len(A)
    
    for i in range(1,len(A)-1):
        leftMaxSum[i] = max(0, leftMaxSum[i-1] + A[i])
    for i in range(len(A)-2, 0, -1):
        rightMaxSum[i] = max(0, rightMaxSum[i+1] + A[i])
        
    maxSum = 0    
    for i in range(1, len(A)-1):
        maxSum = max(maxSum, rightMaxSum[i+1] + leftMaxSum[i-1])
    return maxSum

print(solution(A))