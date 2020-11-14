n, computers = 6,[[1, 0, 1, 1, 0, 0], [0, 1, 0, 0, 1, 1], [1, 0, 1, 1, 1, 1], [1, 0, 1, 1, 1, 1], [0, 1, 1, 1, 1, 1], [0, 1, 1, 1, 1, 1]]
def solution(n, computers):
    connected = [0 for _ in range(len(computers))]
    cnt = 0
    dfs = []
    while 0 in connected:
        x = connected.index(0)
        dfs.append(x)
        connected[x] = 1
        while dfs:
            a = dfs.pop(0)
            for i in range(len(computers[a])):
                if computers[a][i] ==1 and connected[i] ==0:
                    connected[i] =1
                    dfs.append(i)
        cnt +=1
    
    return cnt
print(solution(n,computers))