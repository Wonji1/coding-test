package easytodif;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class dfs_2606 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int computer = Integer.parseInt(br.readLine());
        int edge_cnt = Integer.parseInt(br.readLine());
        int[][] edge = new int[edge_cnt][2];
        StringTokenizer st;
        for(int i=0; i<edge_cnt;i++){
            st = new StringTokenizer(br.readLine());
            edge[i][0] = Integer.parseInt(st.nextToken());
            edge[i][1] = Integer.parseInt(st.nextToken());
        }
        boolean[] check = new boolean[computer+1];
        int answer = 0;
        Queue<Integer> q = new LinkedList<>();
        check[1] = true;
        q.offer(1);
        while(!q.isEmpty()){
            int tmp = q.poll();
            for(int i=0 ; i<edge_cnt;i++){
                if(edge[i][0] == tmp && !check[edge[i][1]]){
                    check[edge[i][1]] = true;
                    answer++;
                    q.offer(edge[i][1]);
                }else if(!check[edge[i][0]] && edge[i][1] == tmp){
                    check[edge[i][0]] = true;
                    answer++;
                    q.offer(edge[i][0]);
                }
            }
        }
        System.out.println(answer);
    }
}

