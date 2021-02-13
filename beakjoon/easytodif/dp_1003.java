package easytodif;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dp_1003 {
    static int dp[][] = new int[41][2];
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;

        for(int i=2;i<41;i++){
            for(int j=0;j<2;j++){
                dp[i][j] = dp[i-1][j] + dp[i-2][j];
            }
        }
        for(int i =0; i<n;i++){
            int p = Integer.parseInt(br.readLine());
            sb.append(dp[p][0]).append(" ").append(dp[p][1]).append("\n");
        }
        System.out.println(sb);
    }
}
