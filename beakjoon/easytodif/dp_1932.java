package easytodif;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class dp_1932 {
    static int[][] arr;
    static Integer[][] dp;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        dp = new Integer[n][n];
        StringTokenizer st;
        for(int i =0 ; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j =0;j<=i;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i =0; i<n;i++){
            dp[n-1][i] = arr[n-1][i];
        }
        System.out.println(tri(0,0));
    }
	static int tri(int depth, int idx) {
        if(depth == arr.length-1 ){
            return dp[depth][idx];
        }
        if(dp[depth][idx] == null){
            dp[depth][idx] = Math.max(tri(depth+1,idx), tri(depth+1, idx+1)) +arr[depth][idx];
        }
        return dp[depth][idx];
	}
}
