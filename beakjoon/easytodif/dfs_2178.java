package easytodif;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class dfs_2178 {
    public static class Node{
        int i;
        int j;
        int point;
        Node(int i,int j, int point){
            this.i = i;
            this.j = j;
            this.point = point;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());
        int[][] map = new int[row][col];
        boolean[][] checked = new boolean[row][col];
        Queue<Node> q = new LinkedList<>();
        for(int i=0; i<row;i++){
            String[] stmp = br.readLine().split("");
            for(int j=0;j<col;j++){
                map[i][j] = Integer.parseInt(stmp[j]);
            }
        }
        checked[0][0] = true;
        q.offer(new Node(0,0,1));
        int answer =Integer.MAX_VALUE;
        while(!q.isEmpty()){
            Node node = q.poll();
            int r = node.i;
            int c = node.j;
            int point = node.point;
            if(r == row-1 && c == col-1){
                answer = Math.min(answer,point);
            }
            if(r>0 && map[r-1][c] ==1 && !checked[r-1][c]){
                checked[r-1][c] = true;
                q.offer(new Node(r-1,c,point+1));
            }
            if(r<row-1 && map[r+1][c] ==1 && !checked[r+1][c]){
                checked[r+1][c] = true;
                q.offer(new Node(r+1,c,point+1));
            }
            if(c>0 && map[r][c-1] ==1 && !checked[r][c-1]){
                checked[r][c-1] = true;
                q.offer(new Node(r,c-1,point+1));
            }
            if(c<col-1 && map[r][c+1] ==1 && !checked[r][c+1]){
                checked[r][c+1] = true;
                q.offer(new Node(r,c+1,point+1));
            }
        }
        System.out.println(answer);
    }
}
