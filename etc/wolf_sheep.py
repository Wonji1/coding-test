R,C = map(int, input().split())
M = [list(input()) for i in range(R)]

dx, dy = [0, 1, 0 ,-1],[-1, 0, 1, 0]
check = False


for i in range(R):
    for j in range(C):
        if M[i][j] == 'W':
            for w in range(4):
                ii, jj = i + dx[w], j +dy[w]
                if ii< 0 or ii == R or jj < 0 or jj == C:
                    continue
                if M[ii][jj] == 'S':
                    check = True

if check == True:
    print(0)
else:
    for i in range(R):
        for j in range(C):
            if M[i][j] not in 'SW':
                M[i][j] = 'D'

for i in M:
    print(''.join(i))