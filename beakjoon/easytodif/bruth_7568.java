package easytodif;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bruth_7568 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        for(int i=0;i<arr.length;i++){
            String[] s = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(s[0]);
            arr[i][1] = Integer.parseInt(s[1]);
        }
        for(int i=0;i<arr.length;i++){
            int cnt = 1;
            for(int j=0;j<arr.length;j++){
                if(arr[i][0]<arr[j][0] && arr[i][1]<arr[j][1]){
                    cnt++;
                }
            }
            System.out.print(cnt + " ");
        }
    }
    
}
