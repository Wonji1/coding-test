import java.util.Scanner;

public class dp3_123make {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        for (int i=0;i<j;i++){
            int n = sc.nextInt();
            int dp[] = new int[12];
            dp [1] = 1;
            dp [2] = 2;
            dp [3] = 4;

            for (int k =4; k<n+1;k++){
                dp[k] = dp[k-3]+ dp[k-2]+dp[k-1];
            };
        System.out.println(dp[n]);
    }
    }
    
}
