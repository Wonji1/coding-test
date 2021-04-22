package easytodif;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class dfs_2206 {
    public static class Node{
        int i;
        int j;
        boolean wall;
        int cnt;
        Node(int i, int j, boolean wall,int cnt){
            this.i = i;
            this.j = j;
            this.wall = wall;
            this.cnt = cnt;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());
        int[][] map = new int[row+1][col+1];
        boolean[][][] checked = new boolean[2][row+1][col+1];
        for(int i=1; i<=row;i++){
            String[] stmp = br.readLine().split("");
            for(int j =1;j <=col;j++){
                int tmp = Integer.parseInt(stmp[j-1]);
                if(tmp == 1){
                    map[i][j] = tmp;
                    checked[0][i][j] = true;
                    checked[1][i][j] = true;
                }
            }
        }
        int answer = bfs(row,col,map,checked);
        System.out.println(answer);
    }
    private static int bfs(int row, int col, int[][] map , boolean[][][] checked) {
        int[] dr = {-1,0,1,0};
        int[] dc = {0,1,0,-1};
        Queue<Node> q= new LinkedList<>();
        q.offer(new Node(1,1,false,1));
        checked[0][1][1] = true;
        checked[1][1][1] = true;
        int ans= Integer.MAX_VALUE;
        while(!q.isEmpty()){
            Node node = q.poll();
            int r = node.i;
            int c = node.j;
            boolean wall = node.wall;
            int cnt = node.cnt;
            if(r == row && c == col){
                ans = Math.min(ans,cnt);
            }
            for(int i=0; i<4;i++){
                int ro = r + dr[i];
                int co = c + dc[i];
                if(ro<= 0 || co<=0 || ro>row || co > col){
                    continue;
                }
                if(!wall){
                    if(map[ro][co] == 0 && !checked[0][ro][co]){
                        checked[0][ro][co] = true;
                        q.offer(new Node(ro, co, false, cnt+1));
                    }
                    if(map[ro][co] == 1){
                        checked[1][ro][co] = true;
                        q.offer(new Node(ro,co,true,cnt+1));
                    }
                }else{
                    if(map[ro][co] == 0 && !checked[1][ro][co]){
                        checked[1][ro][co] = true;
                        q.offer(new Node(ro,co,true,cnt+1));
                    }
                }
            }
        }
        if(ans == Integer.MAX_VALUE){
            return -1;
        }
        return ans;
    }
}
