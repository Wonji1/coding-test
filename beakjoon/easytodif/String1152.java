package easytodif;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String1152 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        if(s.length>0 && s[0].equals("")){  // isEmpty && trim()
            System.out.println(s.length-1);
        }
        else{
            System.out.println(s.length);
        }
    }
}
