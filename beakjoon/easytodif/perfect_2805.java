package easytodif;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class perfect_2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tmp = br.readLine().split(" ");

        int n = Integer.parseInt(tmp[0]);
        int target = Integer.parseInt(tmp[1]);

        int[] trees = new int[n];
        tmp = br.readLine().split(" ");
        for(int i=0; i<n;i++){
            trees[i] = Integer.parseInt(tmp[i]);
        }

        Arrays.sort(trees);
        long first = 1;
        long last = trees[n-1];
        while(first <= last){
            long mid = (first+last)/2;
            long cnt = 0;
            for(int i=0; i<n ; i++){
                if(trees[i] - mid >0){
                    cnt+= (trees[i]-mid);
                }
            }
            if(cnt >= target){
                first = mid+1;
            }else{
                last = mid-1;
            }
        }
        System.out.println(last);
    }
}
