package easytodif;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class dfs_7576 {
    public static class Node{
        int i;
        int j;
        int days;
        Node(int i, int j, int days){
            this.i = i;
            this.j = j;
            this.days = days;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int col = Integer.parseInt(st.nextToken());
        int row = Integer.parseInt(st.nextToken());
        int[][] map = new int[row][col];
        // boolean[][] checked = new boolean[row][col];
        int tmp =0;
        int cnt =0;
        int answer = 0;
        for(int i=0; i<row; i++){
            st = new StringTokenizer(br.readLine()," ");
            for(int j=0; j<col;j++){
                tmp = Integer.parseInt(st.nextToken());
                if(tmp !=0){
                    map[i][j] = tmp;
                    cnt++;
                    // checked[i][j] = true;
                }
            }
        }
        boolean finish = false;
        if(cnt == row*col){
            finish = true;
        }
        answer = bfs(row,col,map,finish);
        System.out.println(answer);
    }

    private static int bfs(int row, int col, int[][] map, boolean finish) {
        if(finish){
            return 0;
        }
        int ans = 0;
        Queue<Node> q = new LinkedList<>();
        for(int i=0; i<row;i++){
            for(int j=0; j<col; j++){
                if(map[i][j] == 1){
                    q.offer(new Node(i,j,0));
                }
            }
        }
        while(!q.isEmpty()){
            Node node = q.poll();
            int r = node.i;
            int c = node.j;
            int days = node.days;
            ans = Math.max(ans, days);
            if(r>0 && map[r-1][c] == 0){
                map[r-1][c] = 1;
                q.offer(new Node(r-1,c,days+1));
            }
            if(r<row-1 && map[r+1][c] == 0){
                map[r+1][c] = 1;
                q.offer(new Node(r+1,c,days+1));
            }
            if(c>0 && map[r][c-1] == 0){
                map[r][c-1] = 1;
                q.offer(new Node(r,c-1,days+1));
            }
            if(c<col-1 && map[r][c+1] == 0){
                map[r][c+1] = 1;
                q.offer(new Node(r,c+1,days+1));
            }
        }
        for(int i=0; i<row;i++){
            for(int j=0; j<col;j++){
                if(map[i][j] == 0){
                    return -1;
                }
            }
        }

        return ans;
    }
}
