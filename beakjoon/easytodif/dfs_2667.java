package easytodif;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class dfs_2667 {
    public static class Node{
        int i;
        int j;

        Node(int i,int j){
            this.i = i;
            this.j = j;
        }
    }
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] map = new int[n+2][n+2];
        boolean[][] checked = new boolean[n+2][n+2];
        List<Integer> list = new ArrayList<>();

        for(int i=1; i<=n;i++){
            String[] stmp = br.readLine().split("");
            for(int j=1;j<=n;j++){
                map[i][j] = Integer.parseInt(stmp[j-1]);
            }
        }
        int cnt =0;
        Queue<Node> q = new LinkedList<>();

        for(int i=1; i<=n;i++){
            for(int j=1;j<=n;j++){
                if(map[i][j] == 1 && !checked[i][j]){
                    cnt++;
                    checked[i][j] = true;
                    q.offer(new Node(i,j));
                    int num = 0;
                    num++;
                    while(!q.isEmpty()){
                        Node node = q.poll();
                        int x= node.i;
                        int y= node.j;
                        if(x>0 && map[x-1][y] == 1 && !checked[x-1][y]){
                            checked[x-1][y] = true;
                            num++;
                            q.offer(new Node(x-1,y));
                        }
                        if(x<=n &&map[x+1][y] == 1 && !checked[x+1][y]){
                            checked[x+1][y] = true;
                            num++;
                            q.offer(new Node(x+1,y));
                        }
                        if(y>0 && map[x][y-1] == 1 && !checked[x][y-1]){
                            checked[x][y-1] = true;
                            num++;
                            q.offer(new Node(x,y-1));
                        }
                        if(y<=n && map[x][y+1] == 1 && !checked[x][y+1]){
                            checked[x][y+1] = true;
                            num++;
                            q.offer(new Node(x,y+1));
                        }
                    }
                    list.add(num);
                }
            }
        }
        Collections.sort(list);
        System.out.println(cnt);
        for(int l : list){
            System.out.println(l);
        }


    }
}