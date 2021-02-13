package easytodif;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class dp_1149 {
    static int[][] arr;
    static int[] visit = new int[3];
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        arr = new int[n][3];
        for(int i=0; i<n;i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][2] = Integer.parseInt(st.nextToken());
        }
        dfs(0,0,0);
        System.out.println(min);
    }

    private static void dfs(int index, int dept, int sum) {
        if (dept == arr.length){
            min = Math.min(min, sum);
            return;
        }
        for(int i =0;i<3;i++){
            if(dept ==0 || index!= i){
                dfs(i, dept+1, sum+arr[dept][i]);
            }

        }

    }
}
