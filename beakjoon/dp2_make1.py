n= int(input())

def make1(n):
    dp = [0 for _ in range(n+1)]
    dp[2] = 1
    for i in range(2,n+1):
        dp[i] = dp[i-1]+1
        if i %2 ==0 and dp[i] > dp[i//2]+1:
            dp[i] = dp[i//2]+1
        if i%3 ==0 and dp[i] > dp[i//3]+1:
            dp[i] = dp[i//3]+1
    return dp[n]

print(make1(1))