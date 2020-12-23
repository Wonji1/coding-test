package easytodif;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String2675 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i=0;i<n;i++){
            String[] str = br.readLine().split(" ");
            int r = Integer.parseInt(str[0]);
            String s = str[1];
            for(int k =0;k<s.length();k++){
               for(int j =0;j<r;j++){
                    System.out.print(s.charAt(k));
                }
            }
            System.out.println();
        }
    }
    
}
