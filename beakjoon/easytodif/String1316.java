package easytodif;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String1316 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        for(int i =0;i<n;i++){
            String s = br.readLine();
            int[] arr = new int[26];
            boolean b = true;
            for(int j=0;j<s.length()-1;j++){
                if(arr[s.charAt(j)-'a'] == -1){
                    b =false;
                    break;
                }
                if(s.charAt(j) != s.charAt(j+1)){
                    arr[s.charAt(j)-'a'] = -1;
                }
            }
            if(arr[s.charAt(s.length()-1) -'a'] == -1){
                b=false;
            }
            if (b){
                cnt+=1;
            }else if(b && s.charAt(s.length()-1) != s.charAt(s.length()-2)){
                cnt+=1;
            }
        }
        System.out.println(cnt);
    }
    
}
