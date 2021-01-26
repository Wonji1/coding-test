package easytodif;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class backtracking_14888 {
    public static int N;
    public static int[] num;
    public static int[] operator = new int[4];
    public static int max = Integer.MIN_VALUE;
    public static int min = Integer.MAX_VALUE;
    
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        num = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N;i++){
            num[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<4;i++){
            operator[i] = Integer.parseInt(st.nextToken());
        }

        dfs(num[0],0);

        System.out.println(max);
        System.out.println(min);
    }

    public static void dfs(int n, int idx) {
        if(idx+1 == N){
            max = Math.max(n, max);
            min = Math.min(n, min);
        }

        for(int i=0; i<4;i++){
            if(operator[i]>0){
                operator[i]--;
                switch(i){
                    case 0 : dfs(n +num[idx+1],idx+1); break;
                    case 1 : dfs(n -num[idx+1],idx+1); break;
                    case 2 : dfs(n *num[idx+1],idx+1); break;
                    case 3 : dfs(n /num[idx+1],idx+1); break;
                }
                operator[i]++;
            }
        }
    }
}
