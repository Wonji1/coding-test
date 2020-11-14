N, L, K = map(int,input().split())

easy, hard, ans = 0, 0, 0

for i in range(N):
    sub1, sub2 = map(int, input().split())
    
    if L >= sub2:
        hard += 1
    elif L >= sub1:
        easy += 1

ans += min(K,hard) * 140

if hard < K:
    ans += min(K-hard, easy) * 100

print(ans)