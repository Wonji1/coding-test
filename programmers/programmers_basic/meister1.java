import java.util.HashMap;
import java.util.Map;

public class meister1 {
    public static int solution(int[] nums) {
        int answer = 0;
        int N = nums.length/2;
        Map<Integer,Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        if(map.size()>= N){
            answer = N;
        }else{
            answer = map.size();
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] nums = {3,1,2,3};
        int answer = solution(nums);
        System.out.println(answer);
    }
}
