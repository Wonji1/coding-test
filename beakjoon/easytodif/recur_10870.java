package easytodif;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class recur_10870 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(recur(n));
    }
    public static int recur(int n){
        if (n ==1)return 1;
        if (n ==0)return 0;
        return recur(n-1)+ recur(n-2);
    }
}
