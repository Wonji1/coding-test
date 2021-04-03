import java.util.ArrayList;
import java.util.List;

public class backChallenge1 {
    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<win_nums.length;i++){
            list.add(win_nums[i]);
        }
        int zero_cnt = 0;
        for(int l : lottos){
            if (l == 0){
                zero_cnt++;
                continue;
            }
            list.remove((Integer)l);
        }
        int rank =0;
        if(list.size()-zero_cnt>=5){
            rank =6;
        }else{
            rank = list.size()-zero_cnt +1;
        }
        answer[0] = rank;

        if(list.size()>= 5){
            rank = 6;
        }
        else{
            rank = list.size()+1;
        }
        answer[1] = rank;

        return answer;
    }
    public static void main(String[] args) {
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};
        int answer[] = solution(lottos, win_nums);
        for(int a : answer){
            System.out.println(a);
        }
    }
}
