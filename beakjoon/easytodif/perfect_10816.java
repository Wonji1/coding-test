package easytodif;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class perfect_10816 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] num = new long[n];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<n;i++){
            num[i] = Integer.parseInt(st.nextToken());
        }
        int nn = Integer.parseInt(br.readLine());
        long[] find = new long[nn];
        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<nn;i++){
            find[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(num);

        int[] answer = new int[nn];
        for(int i=0; i< nn;i++){
            int first = 0;
            int last = num.length-1;
            int mid = 0;
            int cnt = 0;
            while(first <= last){
                mid = (first+last)/2;
                if(num[mid] > find[i]){
                    last = mid-1;
                }else if(num[mid] <= find[i]){
                    first = mid+1;
                    if(num[mid] == find[i]){
                        int tmp =mid;
                        while(mid>0){
                            if(num[--mid] == find[i]){
                                cnt++;
                            }
                        }
                        cnt++;
                        while(tmp<num.length-1){
                            if(num[++tmp] == find[i]){
                                cnt++;
                            }
                        }
                        break;
                    }
                }
            }
            answer[i] = cnt;
        }
        for(int a : answer){
            System.out.print(a+" ");
        }
    }
}
