package easytodif;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class perfect_1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n =Integer.parseInt(st.nextToken());
        long target = Integer.parseInt(st.nextToken());
        long[] lan = new long[n];
        for(int i =0; i<n; i++){
            lan[i] = Integer.parseInt(br.readLine());
        }
        
        long first = 1;
        long last = 1000000;
        
        while(first <= last){
            long mid = (first+last) / 2;
            int cnt= 0;
            for(int i= 0; i< lan.length;i++){
                cnt += lan[i] / mid;
            }
            if(cnt < target){
                last = mid-1;
            }else if( cnt>= target){
                first = mid+1;
            }
            
        }
        System.out.println(first);
    }
}
