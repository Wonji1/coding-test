package easytodif;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class t15927 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String tmp = br.readLine();
        int start =0;
        int end = tmp.length()-1;
        char ctmp = tmp.charAt(0);
        boolean flag = false;
        int answer =0;
        while(start <= end){
            if(tmp.charAt(start) != tmp.charAt(end)){
                answer = tmp.length();
                break;
            }else{
                if(tmp.charAt(start) != ctmp){
                    flag = true;
                }
            }
            start++;
            end--;
        }
        if(start> end){
            answer = tmp.length()-1;
            if(!flag){
                answer = -1;
            }
        }
        System.out.println(answer);
  
    }
}
