package easytodif;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class dfs_1697 {
    public static class Node{
        int subin;
        int cnt;
        Node (int subin, int cnt){
            this.subin = subin;
            this.cnt = cnt;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int old = Integer.parseInt(st.nextToken());
        int young = Integer.parseInt(st.nextToken());
        int answer = bfs(old,young);
        System.out.println(answer);
    }

    private static int bfs(int old, int young) {
        if(young <= old){
            return old -young;
        }
        int ans = Integer.MAX_VALUE;
        boolean[] checked = new boolean[100001];
        Queue<Node> q = new LinkedList<>();
        checked[old] = true;
        q.offer(new Node(old,0));

        while(!q.isEmpty()){
            Node node = q.poll();
            int subin = node.subin;
            int cnt = node.cnt;
            if(subin == young){
                ans = Math.min(ans,cnt);
            }
            if(subin>0 && !checked[subin-1]){
                checked[subin-1] = true;
                q.offer(new Node(subin-1,cnt+1));
            }
            if(subin < checked.length-1 && !checked[subin+1]){
                checked[subin+1] = true;
                q.offer(new Node(subin+1,cnt+1));
            }
            if(subin*2 < checked.length && !checked[subin*2]){
                checked[subin*2] = true;
                q.offer(new Node(subin*2,cnt+1));
            }
        }
        return ans;
    }
}
