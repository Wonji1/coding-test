package easytodif;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class backtracking_9663 {
    public static int[] arr;
    public static int N;
    public static int cnt = 0;
    
    public static void NQ(int depth){
        if(depth == N){
            cnt++;
            return;
        }

        for(int i=0;i<N;i++){
            arr[depth] = i;
            if(possible(depth)){
                NQ(depth+1);
            }
        }
    }
    public static boolean possible(int col){
        for(int i=0; i<col;i++){
            if(arr[i] == arr[col]){
                return false;
            }
            else if(Math.abs(arr[i] - arr[col]) == Math.abs(i - col)){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        NQ(0);
        System.out.println(cnt);

    }
    
    
}
