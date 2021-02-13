package easytodif;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dp_1904 {
    static int[] dp;
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i= 2; i<n+1;i++){
            dp[i]=-1;
        }
        System.out.println( tiles(n));
    }
    static int tiles(int s){
        if(dp[s] == -1){
            dp[s] = (tiles(s-1) + tiles(s-2))% 15746;
        }

        return dp[s];
    }
}
