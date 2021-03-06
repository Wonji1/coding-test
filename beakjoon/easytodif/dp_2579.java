package easytodif;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dp_2579 {
    static int[] arr;
    static int[] dp;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n+1];
        dp = new int[n+1];
        for (int i = 1; i<=n ; i++){
            arr[i]  = Integer.parseInt(br.readLine());
        }
        dp[1] = arr[1];
        if(n>=2){
            dp[2] = arr[1]+arr[2];
        }
        System.out.println(stair(n));
    }

    private static int stair(int n) {
        if (n>0 && dp[n] == 0){
            dp[n] = Math.max(stair(n-3)+arr[n-1],stair(n-2)) + arr[n];
        }
        return dp[n];
    }
    
}
