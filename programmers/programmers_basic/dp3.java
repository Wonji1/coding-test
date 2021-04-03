public class dp3 {
    public static int solution(int m, int n, int[][] puddles) {
        int answer = 0;
        int[][] dp = new int[n+1][m+1];
        dp[1][1] = 1;
        for(int[] p : puddles){
            dp[p[1]][p[0]] = -1;
        }
        for(int i=1; i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(i==1&&j==1){
                    continue;
                }
                if(dp[i][j] == -1){
                    continue;
                }
                if(dp[i-1][j] != -1 && dp[i][j-1] != -1){
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        answer = dp[n][m];
        return answer;
    }
    public static void main(String[] args) {
        int m =4;
        int n =3;
        int[][] puddles = {{2,2}};
        int answer = solution(m, n, puddles);
        System.out.println(answer);
    }
}
