import java.util.LinkedList;
import java.util.Queue;

public class stackque1 {
    public static void main(String[] args) {
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weight = {7, 4, 5, 6};
    
        Queue<Integer> birQueue = new LinkedList<>();
        int sum_t = truck_weight[0];
        birQueue.offer(truck_weight[0]);
        int cnt =1;
        for(int i =1;i<truck_weight.length;i++){
            while(true){
                if (birQueue.size() == bridge_length){
                    sum_t -= birQueue.poll();
                }
                else if(truck_weight[i] + sum_t <=weight){
                    birQueue.offer(truck_weight[i]);
                    sum_t += truck_weight[i];
                    cnt++;
                    break;
                }
                else if (truck_weight[i] +sum_t > weight){
                    birQueue.offer(0);
                    cnt++;
                }
            }   
        }
        System.out.println(cnt + bridge_length);
    }
}
