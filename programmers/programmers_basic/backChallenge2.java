public class backChallenge2 {
    public static int rotate(int[][] board, int[] query){
        int min = Integer.MAX_VALUE;
        int cnt =0;
        int x = query[2] - query[0];
        int y = query[3] - query[1];
        int x_start = query[0] -1;
        int x_end = query[2] -1;
        int y_start = query[1] -1;
        int y_end = query[3] -1;
        int tmp = board[x_start][y_start];
        int x_move = query[0] -1;
        int y_move = query[1] -1;
        int sign = 0;

        while(cnt<= (x+y)*2 +1){
            min = Math.min(min, board[x_move][y_move]);
            cnt++;
            if(sign == 0){
                if(x_move<x_end){
                    board[x_move][y_move] = board[x_move+1][y_move];
                    x_move++;
                }
                else{
                    sign = 1;
                }
            }
            else if(sign == 1){
                if(y_move<y_end){
                    board[x_move][y_move] = board[x_move][y_move+1];
                    y_move++;
                }
                else{
                    sign = 2;
                }
            }
            else if(sign == 2){
                if(x_move>x_start){
                    board[x_move][y_move] = board[x_move-1][y_move];
                    x_move--;
                }
                else{
                    sign = 3;
                }
            }
            else if(sign == 3){
                if(y_move>y_start){
                    board[x_move][y_move] = board[x_move][y_move-1];
                    y_move--;
                }
                else{
                    sign = 0;
                }
            }
        }
        min = Math.min(min, board[x_move][y_move]);
        board[x_move][y_move] = tmp;
        return min;
    }

    public static int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        int[][] board = new int[rows][columns];
        int board_i=1;
        for(int i=0;i < board.length;i++){
            for(int j=0;j<board[0].length;j++){
                board[i][j] = board_i++;
            }
        }
        for(int i=0; i< queries.length;i++){
            int min = rotate(board,queries[i]);
            answer[i] = min;
        }
        return answer;
    }
    public static void main(String[] args) {
        int rows = 6;
        int columns = 6;
        int[][] queries = {{2,2,5,4},{3,3,6,6},{5,1,6,3}};
        int[] answer = solution(rows, columns, queries);

        for(int a : answer){
            System.out.println(a);
        }
    }
}
