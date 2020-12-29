package easytodif;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class math1_1193 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        int cnt = 1;
        while(sum < n){
            sum += cnt;
            cnt++;
        }
        cnt--;
        int m = sum-n;
        if (cnt % 2 ==1){
            System.out.println((m+1)+"/"+(cnt-m));
        }
        else{
            System.out.println((cnt-m)+"/"+(m+1));
        }
    }
    
}
