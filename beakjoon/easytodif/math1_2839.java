package easytodif;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class math1_2839 {
    public static int cB(int n){
        int f = n/5;
        int cntF = 0;
        int minth = 2000;
        int tmp = 0;
        for (int i = 0; i<=f;i++){
            tmp = n - 5*i;
            if((tmp)% 3 == 0){
                if(minth>tmp/3){
                    cntF = i;
                    minth = tmp/3;
                }
            }
        }
        if(minth != 2000){
            return cntF +minth;
        }
        return -1;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(cB(n));
    }
}
