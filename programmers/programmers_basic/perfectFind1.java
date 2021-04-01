import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class perfectFind1 {
    public static void main(String[] args) {
        int[] answers = {1,3,2,4,2};
        int[] supo1 = {1,2,3,4,5};
        int[] supo2 = {2,1,2,3,2,4,2,5};
        int[] supo3 = {3,3,1,1,2,2,4,4,5,5};

        int[] supo_cnt = {0,0,0};

        for(int i =0; i<answers.length;i++){
            if(answers[i] == supo1[i%supo1.length]){
                supo_cnt[0]++;
            }
            if(answers[i] == supo2[i%supo2.length]){
                supo_cnt[1]++;
            }
            if(answers[i] == supo3[i%supo3.length]){
                supo_cnt[2]++;
            }
        }
        List<Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i=0;i<3;i++){
            if(max < supo_cnt[i]){
                list = new ArrayList<>();
                max = supo_cnt[i];
                list.add(i+1);
            }else if(max == supo_cnt[i]){
                list.add(i+1);
            }
        }
        int[] answer = new int[list.size()];


            for(int i=0;i<answer.length;i++){
                answer[i] = list.get(i);
                System.out.println(answer[i]);
            }
        
        Arrays.sort(answer);

    }
}
