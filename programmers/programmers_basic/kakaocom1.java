import java.util.ArrayList;
import java.util.List;

public class kakaocom1 {
    public static int solution(int[] gift_cards, int[] wants) {
        int answer = 0;
        List<Integer> wantsList = new ArrayList<>();
        for(int w : wants){
            wantsList.add(w);
        }
        for(int g : gift_cards){
            wantsList.remove((Integer) g);
        }
        answer = wantsList.size();
        return answer;
    }
    public static void main(String[] args) {
        int[] gift_cards = {5, 4, 5, 4, 5};
        int[] wants = {1, 2, 3, 5, 4};
        int answer = solution(gift_cards, wants);
        System.out.println(answer);
    }
}
