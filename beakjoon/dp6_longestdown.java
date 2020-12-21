import java.util.Scanner;

public class dp6_longestdown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[1001];
        int[] dp = new int[1001];
        for(int i=1;i<=n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=1;i<=n;i++){
            int tmp = 0;
            for (int j =1;j<=i;j++){
                if (arr[j] > arr[i]){
                    tmp = Math.max(dp[j],tmp);
                }
            }
            dp[i] = tmp +1;
        }
        int max = 0;
        for(int i =0;i<=n;i++){
            max = Math.max(dp[i],max);
        }
        System.out.println(max);

        sc.close();
    }
    
}
