N= -151515
def solution(N):
    str_N = str(N)
    if str_N[0] == '-':
        str_N = str_N[::-1]
        for i in range(len(str_N)):
            if str_N[i] <= '5':
                str_N = str_N[:i] + '5'+ str_N[i:]
                return str_N[::-1]
    else:
        for i in range(len(str_N)):
            if str_N[i] <= '5':
                str_N = str_N[:i] + '5' + str_N[i:]
                return str_N
print(solution(N))