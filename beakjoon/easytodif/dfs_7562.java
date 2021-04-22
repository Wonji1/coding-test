package easytodif;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class dfs_7562 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i=0; i<n;i++){
            int size = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine()," ");
            int start_row = Integer.parseInt(st.nextToken());
            int start_col = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine()," ");
            int target_row = Integer.parseInt(st.nextToken());
            int target_col = Integer.parseInt(st.nextToken());

            int answer = bfs(size, start_row,start_col, target_row, target_col);
            System.out.println(answer);
        }
    }

    private static int bfs(int size, int start_row, int start_col, int target_row, int target_col) {
        int[] dr = {-1,-2,-2,-1,1,2,2,1};
        int[] dc = {-2,-1,1,2,2,1,-1,-2};
        boolean[][] checked = new boolean[size][size];
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(start_row,start_col,0));
        checked[start_row][start_col] = true;
        while(!q.isEmpty()){
            Node node = q.poll();
            int r = node.i;
            int c= node.j;
            int cnt = node.cnt;
            if(r == target_row && c == target_col){
                return cnt;
            }
            for(int i=0; i<8;i++){
                int ro = r + dr[i];
                int co = c + dc[i];
                if(ro<0 || co <0 || ro>= size || co>=size){
                    continue;
                }
                if(!checked[ro][co]){
                    checked[ro][co] = true;
                    q.offer(new Node(ro, co, cnt+1));
                }
            }
        }
        return 0;
    }
    public static class Node{
        int i;
        int j;
        int cnt;
        Node(int i, int j, int cnt){
            this.i = i;
            this.j= j;
            this.cnt = cnt;
        }
    }
}
