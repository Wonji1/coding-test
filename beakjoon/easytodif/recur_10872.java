package easytodif;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class recur_10872 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(recur(n));
        
    }
    public static int recur(int n){
        if(n<=1){
            return 1;
        }
        return n * recur(n-1);
    }
}
