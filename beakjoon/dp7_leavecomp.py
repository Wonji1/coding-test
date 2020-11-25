import sys
N = int(sys.stdin.readline())
T,P = [],[]
dp = [0] * (N+1)

for i in range(N):
    temp = list(map(int, sys.stdin.readline().split()))
    T.append(temp[0])
    P.append(temp[1])

for j in range(N):
    if j + T[j] <= N:
        dp[j+T[j]] = max(dp[j+T[j]], dp[j] + P[j])
    dp[j+1] = max(dp[j+1], dp[j])

print(dp[N])