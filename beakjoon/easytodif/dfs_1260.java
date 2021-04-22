package easytodif;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class dfs_1260 {
    static StringBuilder dfs_sb = new StringBuilder();
    static StringBuilder bfs_sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int node = Integer.parseInt(st.nextToken());
        int edge = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());
        int[][] edgeArr = new int[edge*2][2];
        boolean[] checked = new boolean[node+1];
        for(int i=0; i< edge;i++){
            st = new StringTokenizer(br.readLine());
            
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());
            edgeArr[i][0] = first;
            edgeArr[i][1] = second;
            edgeArr[i+edge][0] = second;
            edgeArr[i+edge][1] = first;
        }
        Arrays.sort(edgeArr, (o1,o2) -> {
            if( o1[0] == o2[0]){
                return o1[1] -o2[1];
            }
            return o1[0] - o2[0];
        });
        checked[start] = true;
        dfs(edgeArr, checked,1, start);
        checked = new boolean[node+1];
        checked[start] = true;
        bfs(edgeArr, checked, start);
        System.out.println(dfs_sb);
        System.out.println(bfs_sb);
    }
    
    private static void bfs(int[][] edgeArr, boolean[] checked, int start) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        while(!q.isEmpty()){
            int tmp = q.poll();
            bfs_sb.append(tmp + " ");
            for(int i=0; i< edgeArr.length;i++){
                if(!checked[edgeArr[i][0]] && edgeArr[i][1] == tmp){
                    checked[edgeArr[i][0]] = true;
                    q.offer(edgeArr[i][0]);
                }else if (!checked[edgeArr[i][1]] && edgeArr[i][0] == tmp){
                    checked[edgeArr[i][1]] = true;
                    q.offer(edgeArr[i][1]);
                }
            }
        }
    }

    private static void dfs(int[][] edgeArr, boolean[] checked, int depth, int start) {
        dfs_sb.append(start + " ");
        if(depth == checked.length){
            return;
        }
        for(int i=0; i< edgeArr.length;i++){
            if(edgeArr[i][0] == start && !checked[edgeArr[i][1]]){
                checked[edgeArr[i][1]] = true;
                dfs(edgeArr, checked, depth+1, edgeArr[i][1]);
            }else if(!checked[edgeArr[i][0]] && edgeArr[i][1] == start){
                checked[edgeArr[i][0]] = true;
                dfs(edgeArr, checked, depth+1, edgeArr[i][0]);

            }
        }
    }
}
