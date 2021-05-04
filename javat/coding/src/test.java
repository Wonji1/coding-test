import java.util.*;
public class test {
    public static void main(String[] args) {
        int k =3;
        int[] stones = {2, 4, 5, 3, 2, 1, 4, 2, 5, 1};
        long answer = solution(stones, k);
        System.out.println(answer);
    }
    public static long solution(int[] stones, int k) {
        long answer = 0;
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        for(int s: stones){
            min = Math.min(min,s);
            max = Math.max(max,s);
        }
        while(min < max){
            long mid = (min+max+1)/2;
            int cnt =0;
            for(int s : stones){
                if( s - mid <0){
                    cnt++;
                }else{
                    cnt = 0;
                }
                if(cnt == k){
                    max = mid-1;
                }else{
                    min = mid+1;
                }
            }
        }
        answer = max-1;
        return answer;
    }
}
 

