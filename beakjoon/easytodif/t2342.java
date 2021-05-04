package easytodif;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class t2342 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        List<Integer> list = new LinkedList<>();
        while(true){
            int tmp = Integer.parseInt(st.nextToken());
            if(tmp == 0){
                break;
            }
            list.add(tmp);
        }
        int answer =0;
        if(list.size()>0){
            answer = bfs(list);
        }
        System.out.println(answer);
    }
    public static int bfs(List<Integer> list){
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(list.get(0), 0, 2,1));
        int min = Integer.MAX_VALUE;
        while(!q.isEmpty()){
            Node n = q.poll();
            int l = n.l;
            int r = n.r;
            int cnt = n.cnt;
            int idx = n.idx;
            if(idx == list.size()){
                min = Math.min(min, cnt);
                continue;
            }
            if(l == list.get(idx)){
                q.offer(new Node(l,r,cnt+move(l,list.get(idx)),idx+1));
            }
            else if(r == list.get(idx)){
                q.offer(new Node(l,r,cnt+move(r,list.get(idx)),idx+1));
            }
            else{
                q.offer(new Node(list.get(idx),r, cnt+move(l,list.get(idx)), idx+1));
                q.offer(new Node(l,list.get(idx), cnt+move(r,list.get(idx)), idx+1));
            }
            
        }

        return min;
    }
    public static class Node{
        int l;
        int r;
        int cnt;
        int idx;
        Node(int l, int r, int cnt, int idx){
            this.l = l;
            this.r = r;
            this.cnt = cnt;
            this.idx = idx;
        }
    }

    public static int move(int from, int to){
        if(from ==0){
            return 2;
        }
        if(from == to){
            return 1;
        }
        if(Math.abs(from - to) == 2){
            return 4;
        }
        return 3;
    }
}
