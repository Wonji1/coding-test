package easytodif;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class dfs_1012 {
    public static class Node{
        int i;
        int j;
        Node(int i, int j){
            this.i = i;
            this.j = j;
        }
    }
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i=0; i<n;i++){
            st = new StringTokenizer(br.readLine()," ");
            int col = Integer.parseInt(st.nextToken());
            int row = Integer.parseInt(st.nextToken());
            int worm = Integer.parseInt(st.nextToken());
            int[][] map = new int[row][col];
            boolean[][] checked = new boolean[row][col];
            Queue<Node> q = new LinkedList<>();
            int cnt = 0;

            for(int w=0; w<worm;w++){
                st = new StringTokenizer(br.readLine()," ");
                int c = Integer.parseInt(st.nextToken());
                int r = Integer.parseInt(st.nextToken());
                map[r][c] = 1;
            }

            for(int j = 0; j<row; j++){
                for(int k = 0; k<col; k++){
                    if(map[j][k] == 1 && !checked[j][k]){
                        q.offer(new Node(j,k));
                        checked[j][k] = true;
                        cnt++;
                        while(!q.isEmpty()){
                            Node node = q.poll();
                            int r= node.i;
                            int c= node.j;
                            if(r>0 && map[r-1][c] == 1 && !checked[r-1][c]){
                                q.offer(new Node(r-1,c));
                                checked[r-1][c] = true;
                            }
                            if(r<row-1 && map[r+1][c] == 1 && !checked[r+1][c]){
                                q.offer(new Node(r+1,c));
                                checked[r+1][c] = true;
                            }
                            if(c>0 && map[r][c-1] == 1 && !checked[r][c-1]){
                                q.offer(new Node(r,c-1));
                                checked[r][c-1] = true;
                            }
                            if(c<col-1 && map[r][c+1] == 1 && !checked[r][c+1]){
                                q.offer(new Node(r,c+1));
                                checked[r][c+1] = true;
                            }
                        }
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}
