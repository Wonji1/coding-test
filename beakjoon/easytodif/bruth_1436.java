package easytodif;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bruth_1436 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        int cnt = 0;
        int num =0;
        while (cnt != n){
            num++;
            if(String.valueOf(num).contains("666")){
                cnt++;
            }
        }
        System.out.println(num);
    }
    
}
