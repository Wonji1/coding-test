import copy
#m, n, board = 6,6,['TTTANT', 'RRFACC', 'RRRFCC', 'TRRRAA', 'TTMMMF', 'TMMTTJ']
m,n,board = 6,6,['AABBEE','AAAEEE','VAAEEV','AABBEE','AACCEE','VVCCEE' ]
def solution(m, n, board):
    answer = 0
    for q in range(m):
        board[q] = list(board[q])
    board_copy = copy.deepcopy(board)
    flag = True
    while flag:
        flag = False
        for i in range(1,m):
            for j in range(1,n):
                if board[i][j] == board[i-1][j] == board[i][j-1] == board[i-1][j-1] and board[i][j] != 0:  
                    flag = True
                    board_copy[i][j],board_copy[i-1][j],board_copy[i][j-1],board_copy[i-1][j-1] = 0,0,0,0
        board = copy.deepcopy(board_copy)
        for i in range(m-1,0,-1):
            for j in range(n-1,-1,-1):
                if board[i][j] ==0:
                    for k in range(1,i+1):
                        if board[i-k][j] != 0:
                            board[i][j] = board[i-k][j]
                            board[i-k][j] = 0
                            break
        board_copy = copy.deepcopy(board)
        
    for w in range(m):
        a = board[w].count(0)
        answer += a
                
    return answer

print(solution(m,n,board))