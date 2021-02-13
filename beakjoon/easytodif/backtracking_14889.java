package easytodif;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class backtracking_14889 {
    public static int[][] arr;
    public static int n;
    public static boolean[] person;
    public static int min = Integer.MAX_VALUE;
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        person = new boolean[n];
        StringTokenizer st;
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<n;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        combi(0,0);
        System.out.println(min);

    }

    private static void combi(int idx, int dept) {
        if(dept == n/2){
            diff();
            return;
        }
        for(int i = idx;i<n;i++){
            if(!person[i]){
                person[i]=true;
                combi(i+1,dept+1);
                person[i]=false;
            }
        }

    }

    private static void diff() {
        int starter=0;
        int linker=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(person[i] && person[j]){
                    starter += arr[i][j];
                    starter += arr[j][i];
                }
                else if(!person[i] && !person[j]){
                    linker+= arr[i][j];
                    linker+= arr[j][i];
                }
            }
        }
        int val = Math.abs(starter- linker);
        if(val == 0){
            System.out.println(val);
            System.exit(0);
        }
        min = Math.min(val, min);
    }
}
