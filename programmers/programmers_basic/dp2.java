import java.util.Arrays;

public class dp2 {
    public static int solution(int[][] triangle) {
        int answer = 0;
        int[][] dp = new int[triangle.length][triangle.length];
        dp[0][0] = triangle[0][0];
        for(int i=1; i< triangle.length;i++){
            int start = 0;
            int end = triangle[i].length-1;
            for(int j=0;j<triangle[i].length;j++){
                if(j == start){
                    dp[i][j] = dp[i-1][j] + triangle[i][j];
                }
                else if (j == end){
                    dp[i][j] = dp[i-1][j-1] + triangle[i][j];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j-1], dp[i-1][j]) + triangle[i][j];
                }
            }
        }
        int[] lastArr = dp[dp.length-1];
        Arrays.sort(lastArr);
        answer = lastArr[lastArr.length-1];
        return answer;
    }
    public static void main(String[] args) {
        int[][] triangle = {{7},{3,8},{8,1,0},{2,7,4,4},{4,5,2,6,5}};
        System.out.println(solution(triangle));
    }
}
