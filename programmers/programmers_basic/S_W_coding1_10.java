import java.util.Arrays;
import java.util.PriorityQueue;

public class S_W_coding1_10 {
    public static int solution(int[] A, int[] B) {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1,o2) -> o2-o1);
        for(int b : B){
            pq.offer(b);
        }
        int idx = A.length-1;
        while(idx >= 0){
            if(pq.peek() > A[idx]){
                pq.poll();
                idx--;
                answer++;
            }else{
                idx--;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] A = {5,1,3,7};
        int[] B = {2,2,6,8};
        int answer = solution(A, B);
        System.out.println(answer);
    }
}
