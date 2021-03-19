board = [[0,1,1,1],[1,1,1,1],[1,1,1,1],[0,0,1,0]]

def solution(board):
    answer = 0
    for i in range(1, len(board)):
        for j in range(1, len(board[0])):
            if board[i][j] >= 1:
                board[i][j] = min(board[i-1][j], board[i][j-1], board[i-1][j-1]) +1

    max_index = []
    for i in range(len(board)):
        max_index.append(max(board[i]))

    return max(max_index) **2

print(solution(board))