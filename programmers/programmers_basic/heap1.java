import java.util.PriorityQueue;
import java.util.Queue;

public class heap1 {
    public static void main(String[] args) {
        int[] scoville = {1,2,3,9,10,12};
        int K = 7;
        int cnt =0;
        Queue<Integer> pQueue = new PriorityQueue<>();
        for(int cs : scoville){
            pQueue.offer(cs);
        }
        while(pQueue.peek()<K){
            int min = pQueue.poll();
            int min2 = pQueue.poll();
            int mix = min + min2*2;
            pQueue.offer(mix);
            cnt++;
        }
        System.out.println(cnt);
    }
}
