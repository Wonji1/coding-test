package easytodif;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String10809{
    public static void main(String[] args) throws IOException{
        BufferedReader dr = new BufferedReader(new InputStreamReader(System.in));
        String s = dr.readLine();
        int[] arr = new int[26];
        for(int i =0; i<26;i++){
            arr[i] = -1;
        }
        for(int i =0; i<s.length();i++){
            int idx = s.charAt(i)-'a';
            if(arr[idx] == -1){
            arr[idx] = i;}
        }
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}