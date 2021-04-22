package easytodif;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class dfs_7569 {
    public static class Node{
        int i;
        int j;
        int k;
        int days;
        Node(int i, int j, int k, int days){
            this.i = i;
            this.j = j;
            this.k = k;
            this.days = days;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int col = Integer.parseInt(st.nextToken());
        int row = Integer.parseInt(st.nextToken());
        int height = Integer.parseInt(st.nextToken());
        int[][][] map = new int[row][col][height];
        int tmp = 0;
        int cnt = 0;
        int answer = 0;
        for(int i =0; i< row*height;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j < col;j++){
                tmp = Integer.parseInt(st.nextToken());
                if(tmp != 0 ){
                    cnt++;
                    map[i%row][j][i/row] = tmp;
                }
            }
        }
        boolean finish = false;
        if(cnt == row*height*col){
            finish = true;
        }
        answer = bfs(row,col,height, map, finish);
        System.out.println(answer);
    }

    private static int bfs(int row, int col, int height, int[][][] map, boolean finish) {
        if(finish){
            return 0;
        }
        int ans = 0;
        Queue<Node> q = new LinkedList<>();
        for(int k=0; k< height; k++){
            for(int i=0; i<row;i++){
                for(int j=0;j<col;j++){
                    if(map[i][j][k] == 1){
                        q.offer(new Node(i,j,k,0));
                    }
                }
            }
        }
        while(!q.isEmpty()){
            Node node = q.poll();
            int r = node.i;
            int c = node.j;
            int h = node.k;
            int days = node.days;
            ans = Math.max(ans,days);
            if(r>0 && map[r-1][c][h] == 0){
                map[r-1][c][h] = 1;
                q.offer(new Node(r-1,c,h,days+1));
            }
            if(r<row-1 && map[r+1][c][h] == 0){
                map[r+1][c][h] = 1;
                q.offer(new Node(r+1,c,h,days+1));
            }
            if(c>0 && map[r][c-1][h] == 0){
                map[r][c-1][h] = 1;
                q.offer(new Node(r,c-1,h,days+1));
            }
            if(c<col-1 && map[r][c+1][h] == 0){
                map[r][c+1][h] = 1;
                q.offer(new Node(r,c+1,h,days+1));
            }
            if(h>0 && map[r][c][h-1] == 0){
                map[r][c][h-1] = 1;
                q.offer(new Node(r,c,h-1,days+1));
            }
            if(h<height-1 && map[r][c][h+1] == 0){
                map[r][c][h+1] = 1;
                q.offer(new Node(r,c,h+1,days+1));
            }

        }
        for(int k=0; k<height;k++){
            for(int i= 0; i<row;i++){
                for(int j=0; j<col; j++){
                    if(map[i][j][k] == 0){
                        return -1;
                    }
                }
            }
        }
        return ans;
    }
}
