package easytodif;

import java.util.Scanner;

public class String11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        sc.close();
        int sum = 0;
        for(int i =0; i<n;i++){
            sum += s.charAt(i)-'0';
        }
        System.out.println(sum);
    }
}
