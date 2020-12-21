import java.util.Scanner;

public class dp4_stairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] stairs = new int[301];
        int[] dp = new int[301];
        for(int i=1;i<n+1;i++){
            stairs[i] = sc.nextInt();
        }
        dp[1] = stairs[1];
        dp[2] = stairs[1] +stairs[2];
        if(n<3){
            dp[3] = Math.max(stairs[1]+ stairs[2], stairs[1]+stairs[3]);
        }else{
            dp[3] = Math.max(dp[1]+ stairs[3], stairs[2]+stairs[3]);
        }
        for(int i=4; i<n+1;i++){
            dp[i] = Math.max(dp[i-3]+stairs[i-1]+stairs[i],dp[i-2]+stairs[i]);
        }
        System.out.println(dp[n]);
        sc.close();
    }
}
