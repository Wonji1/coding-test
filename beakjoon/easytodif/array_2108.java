package easytodif;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class array_2108 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int sum =0;
        for (int i=0;i<n;i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }
        Arrays.sort(arr);
        boolean secondMin = false;
        int m = 0;
        int mc =0;
        for(int i=0;i<n;i++){
            int cnt =1;
            for(int j=i+1;j<n;i++){
                if(arr[i] != arr[j]){
                    break;
                }
                cnt++;
                
            }
            if(cnt>mc){
                mc = cnt;
                m = arr[i];
                secondMin = true;
            }else if(cnt == mc && secondMin){
                m = arr[i];
                secondMin = false;
            }
            i+=cnt-1;
        }
        System.out.println((int)(Math.round((double)sum/n)));
        System.out.println(arr[((n+1)/2)-1]);
        System.out.println(m);
        System.out.println(arr[n-1] - arr[0]);
    }
}
