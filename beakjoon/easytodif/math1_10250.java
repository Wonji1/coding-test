package easytodif;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class math1_10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        DecimalFormat df = new DecimalFormat("00");
        for(int i =0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            String back;
            String f;
            if(num%h == 0){
                back = df.format(num/h);
                f = h + back;    
            }
            else{
                back = df.format(num/h+1);
                f = (num%h) + back;
            }
            
            System.out.println(f);
        }
    }
}
