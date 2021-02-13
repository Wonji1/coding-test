package easytodif;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class dp_1149_2 {
    static int[][] dp;
    static int[][] arr;

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        dp = new int[n][3];
        arr = new int[n][3];
        for(int i=0; i<n;i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][2] = Integer.parseInt(st.nextToken());
        }
        dp[0][0] = arr[0][0];
        dp[0][1] = arr[0][1];
        dp[0][2] = arr[0][2];
        
        System.out.println(Math.min(Math.min(rgb(n-1,0), rgb(n-1, 1)), rgb(n-1,2)));

    }
    static int rgb(int floor, int index){
        if(dp[floor][index] ==0){
            if(index == 0){
                dp[floor][0] = Math.min(rgb(floor-1,1),rgb(floor-1,2)) + arr[floor][0];
            }
            else if(index == 1){
                dp[floor][1] = Math.min(rgb(floor-1,0),rgb(floor-1,2)) + arr[floor][1];
            }
            else if(index == 2){
                dp[floor][2] = Math.min(rgb(floor-1,1),rgb(floor-1,0)) + arr[floor][2];
            }
        }
        return dp[floor][index];
    }
}
