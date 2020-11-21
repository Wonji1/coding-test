N = int(input())
seq = list(map(int, input().split()))
dp = [0] * N

for i in range(N):
    tmp = 0
    for j in range(i):
        if seq[i] < seq[j]:
            tmp = max(dp[j],tmp)
    dp[i] = tmp + 1
    
print(max(dp))