package easytodif;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class String1157{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().toUpperCase();
        int[] arr = new int[26];
        for(int i =0; i<s.length();i++){
            arr[s.charAt(i)-'A'] += 1;
        }
        int max = 0;
        for(int i=0; i<arr.length;i++){
            if (arr[max] < arr[i]){
                max =i;
            }
        }
        Arrays.sort(arr);
        if(arr[arr.length-1] == arr[arr.length-2]){
            System.out.println("?");
        }
        else{
            System.out.println((char)('A'+max));
        }
    }
}