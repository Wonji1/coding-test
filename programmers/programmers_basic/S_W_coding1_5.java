public class S_W_coding1_5 {
    public static int solution(int n) {
        int ans = 0;
        int[] dp = new int[n+1];
        dp[1] =1;
        for(int i=2; i<=n;i++){
            if(i % 2 == 0 ){
                dp[i] = Math.min(dp[i-1], dp[i/2]);
            }else{
                dp[i] = dp[i-1]+1;
            }
        }
        ans = dp[n];
        return ans;
    }
    public static void main(String[] args) {
        int N = 5;
        int answer = solution(N);
        System.out.println(answer);
    }
}
