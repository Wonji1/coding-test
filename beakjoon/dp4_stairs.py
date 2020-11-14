n = int(input())

def stairs(n):
    stairs = [0]
    dp = [0 for _ in range(n+3)]
    for i in range(n):
        stairs.append(int(input()))
    if n >3:
        dp[1],dp[2], dp[3]= stairs[1],stairs[1] + stairs[2],max(stairs[1]+stairs[3],stairs[2]+stairs[3])
    else:
        if n ==1:
            return stairs[1]
        elif n==2:
            return stairs[1]+stairs[2]
        else:
            return max(stairs[1]+stairs[2], stairs[1]+stairs[3])
    for i in range(4,n+1):
        dp[i] = stairs[i]
        dp[i] = max(dp[i-3]+stairs[i-1]+stairs[i], dp[i-2] + stairs[i])
    return dp[n]

print(stairs(n))