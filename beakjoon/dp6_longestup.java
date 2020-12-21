import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class dp6_longestup {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[1000];
        int[] dp = new int[1000];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int i =0;i<n;i++){
            int tmp = 0;
            for(int j=0;j<i;j++){
                if(arr[j]<arr[i]){
                    tmp = Math.max(tmp,dp[j]);
                }
            }
            dp[i] = tmp +1;
        }
        int max = 0;
        for(int i=0; i<n;i++){
            max = Math.max(max,dp[i]);
        }
        System.out.println(max);
    }    
}
