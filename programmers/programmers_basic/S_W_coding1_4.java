import java.util.HashMap;
import java.util.Map;

public class S_W_coding1_4 {
    public static int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        Map<String, Integer> map = new HashMap<>();
        map.put(words[0], 1);
        for(int i=1; i<words.length;i++){
            if(map.containsKey(words[i]) || words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)){
                answer[0] = i%n +1;
                answer[1] = i/n +1;
                break;
            }
            map.put(words[i],1);
        }

        return answer;
    }
    public static void main(String[] args) {
        int n =3;
        String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        int answer[] = solution(n, words);
        for(int a : answer){System.out.println(a);}
    }
}
