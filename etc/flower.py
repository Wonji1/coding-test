N = int(input())
G = [list(map(int, input().split())) for i in range(N)]

dx, dy = [0,0,1,0,-1], [0,-1,0,1,0]
    
ans = 10000

def check(lst):
    rst= 0
    flow = []

    for flower in lst:
        x = flower % N
        y = flower // N
        if x ==0 or x == N-1 or y == 0 or y == N-1:
            return 10000
        for g in range(5):
            flow.append((x+dx[g], y+dy[g]))
            rst += G[x+dx[g]][y+dy[g]]
        
    if len(set(flow)) != 15:
        return 10000
    
    return rst

for i in range(N*N):
    for j in range(i+1, N*N):
        for k in range(j+1, N*N):
            ans = min(ans, check([i,j,k]))

print(ans)