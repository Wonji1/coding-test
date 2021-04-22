import java.util.Arrays;

public class S_W_coding1_1 {
    public static int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        int all = 0;
        for(int dd : d){
            all += dd;
            answer++;
            if(all > budget){
                answer--;
                break;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] d = {1,3,2,5,4};
        int budget = 9;
        int answer = solution(d, budget);
        System.out.println(answer);

    }
}
