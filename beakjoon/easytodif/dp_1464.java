package easytodif;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dp_1464 {
    static Integer[] dp;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp = new Integer[n+1];
        dp[1] =0;
        System.out.println(make_1st(n));
    }

    private static int make_1st(int n) {
        if(n == 1){
            return dp[n];
        }
        if(dp[n] == null){

            if(n%6 == 0){
                dp[n] = Math.min(Math.min(make_1st(n/3)+1,make_1st(n/2)+1),make_1st(n-1)+1);
            }
            else if(n%3 ==0){
                dp[n] = Math.min(make_1st(n/3)+1,make_1st(n-1)+1);
            }
            else if (n%2 ==0){
                dp[n] = Math.min(make_1st(n/2)+1,make_1st(n-1)+1);
            }
            else{
                dp[n] = make_1st(n-1)+1;
            }
        }
        return dp[n];

    }
}
