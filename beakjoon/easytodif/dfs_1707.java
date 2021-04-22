package easytodif;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class dfs_1707 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i=0; i<n;i++){
            st = new StringTokenizer(br.readLine());
            int v= Integer.parseInt(st.nextToken());
            int e= Integer.parseInt(st.nextToken());
            int[][] edge = new int[e][2];
            int[] color = new int[v+1];

            for(int j=0; j<e;j++){
                st = new StringTokenizer(br.readLine()," ");
                for(int k=0; k<2;k++){
                    edge[j][k] = Integer.parseInt(st.nextToken());
                }
            }

            String answer = bfs(v,e,edge,color);
            System.out.println(answer);
        }
    }

    private static String bfs(int v, int e, int[][] edgeArr, int[] color) {
        Queue<Node> q = new LinkedList<>();
        color[edgeArr[0][0]] = 1;
        q.offer(new Node(edgeArr[0][0],0));
        while(!q.isEmpty()){
            Node node = q.poll();
            int edge = node.edge;
            int cnt = node.cnt;
            if(cnt == e){
                int a = 0;
                for(int c : color){
                    if(c != 0){
                        a++;
                    }
                }
                if(a != v){
                    return "NO";
                }
                return "YES";
            }
            for(int i=0; i< e;i++){
                int first = edgeArr[i][0];
                int second = edgeArr[i][1];
                if(color[first] == 0 && second == edge){
                    if(color[second] == 1){
                        color[first] = 2;
                        q.offer(new Node(first,cnt+1));
                    }else{
                        color[first] = 1;
                        q.offer(new Node(first,cnt+1));
                    }
                }else if (first == edge && color[second] == 0){
                    if(color[first] == 1){
                        color[second] = 2;
                        q.offer(new Node(second,cnt+1));
                    }else{
                        color[second] = 1;
                        q.offer(new Node(second,cnt+1));
                    }
                }
                if(color[first] != 0 && color[second] !=0 && color[first] == color[second]){
                    return "NO";
                }
            }
        }
        return "NO";
    }
    public static class Node{
        int edge;
        int cnt;
        Node(int edge,int cnt){
            this.edge = edge;
            this.cnt =cnt;
        }
    }
}
