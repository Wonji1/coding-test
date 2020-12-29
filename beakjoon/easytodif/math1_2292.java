package easytodif;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class math1_2292 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 1;
        int cnt = 1;
        while(sum < n){
            sum = sum + 6*cnt;
            cnt++;
        }
        System.out.println(cnt);
    }
    
}
