def check(N,candy):
    for idx in range(N):
        if candy[idx] % 2 == 1:
            candy[idx] += 1
    if len(set(candy)) == 1:
        return 1

def teacher(N,candy):
    tmp_list = [0 for i in range(N)]

    for idx in range(N):
        if candy[idx] %2 == 1:
            candy[idx] += 1
        candy[idx] = candy[idx] // 2
        tmp_list[(idx+1)% N] = candy[idx]
    
    for idx in range(N):
        candy[idx] += tmp_list[idx]
    
    return candy

def candy_war():
    N, candy = int(input()), list(map(int, input().split()))
    cnt = 0

    while not check(N,candy) == 1:
        cnt += 1
        candy = teacher(N, candy)
    
    print (cnt)
        

for i in range(int(input())):
    candy_war()

