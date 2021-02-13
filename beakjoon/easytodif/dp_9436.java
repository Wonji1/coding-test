package easytodif;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dp_9436 {
    static long[] dp;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i =0; i<n;i++){
            int m = Integer.parseInt(br.readLine());
            dp = new long[101];
            dp[0] = 0;
            dp[1] = 1;
            dp[2] = 1;
            for(int j = 3; j<dp.length;j++){
                dp[j] = -1;
            }
            System.out.println(tri(m));
        }
    }
    static long tri(int s){
        if (dp[s] == -1){
            dp[s] = tri(s-2) + tri(s-3);
        }
        return dp[s];
    }
}
