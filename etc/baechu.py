import sys
sys.setrecursionlimit(10000)

T =int(input())

dx, dy = [0, 1, 0, -1], [-1, 0 ,1, 0]

def dfs(B, chk, x , y):

    for i in range(4):
        X , Y = x + dx[i], y+dy[i]
        if B[X][Y] == 0 or chk[X][Y] ==1:
            continue
        chk[X][Y] = 1
        dfs(B,chk,X,Y)


def baechoo():
    M, N, K = map(int, input().split())
    B = [[0 for i in range(M+2)] for _ in range(N+2)]
    chk = [[0 for i in range(M+2)] for _ in range(N+2)]
    answer = 0
    for _ in range(K):
        x,y = map(int, input().split())
        B[y+1][x+1] = 1
    for i in range(1, N+1):
        for j in range(1, M+1):
            if B[i][j] == 0 or chk[i][j] == 1:
                continue
            else:
                chk[i][j] = 1
                dfs(B, chk,i,j)
                answer += 1
    print(answer)

for _ in range(T):
    baechoo()