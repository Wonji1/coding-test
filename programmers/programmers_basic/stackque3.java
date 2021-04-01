import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class stackque3 {
    public static void main(String[] args) {
        int[] progresses ={93,30,55};
        int[] speeds = {1,30,5};
        List<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();

        for(int i=0;i<progresses.length;i++){
            int rest = (100-progresses[i]);
            if(rest % speeds[i] == 0){
                q.offer(rest/speeds[i]);
            }else{
                q.offer(rest/speeds[i]+1);
            }
        }
        while(q.size() != 0){
            int cnt = 1;
            int first = q.poll();
            while(q.size()!= 0){
                if(first >= q.peek()){
                    q.poll();
                    cnt++;
                }else{
                    break;
                }
            }
            ans.add(cnt);
        }
        int[] answer = new int[ans.size()];
        for(int i=0; i<answer.length;i++){
            answer[i] = ans.get(i);
        }

    }
}
