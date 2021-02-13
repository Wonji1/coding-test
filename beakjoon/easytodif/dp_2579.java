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
        arr = new int[n];
        dp = new int[n];
        for (int i = 0; i<n ; i++){
            arr[i]  = Integer.parseInt(br.readLine());
        }
        dp[n-1] = arr[n-1];
        System.out.println(stair(n));
    }

    private static int stair(int n) {
        
    }
    
}
