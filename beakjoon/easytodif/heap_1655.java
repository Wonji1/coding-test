package easytodif;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class heap_1655 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> minpq = new PriorityQueue<>();
        PriorityQueue<Integer> maxpq = new PriorityQueue<>((o1,o2) -> o2-o1);
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<n;i++){
            int subin = Integer.parseInt(br.readLine());
            if(i % 2 ==0){
                maxpq.offer(subin);
            }else{
                minpq.offer(subin);
            }
            if(!maxpq.isEmpty() && !minpq.isEmpty()){
                if(maxpq.peek() > minpq.peek()){
                    int tmp = minpq.poll();
                    minpq.offer(maxpq.poll());
                    maxpq.offer(tmp);
                }
            }
            sb.append(maxpq.peek() + "\n");
        }
        System.out.println(sb);
    }
}
