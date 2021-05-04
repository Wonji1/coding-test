
import java.util.*;

public class li_test {
    public static void main(String[] args) {
        String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
        int[] answer = solution(s);
        for(int a : answer){
            System.out.println(a);
        }
    }
    public static int[] solution(String s) {
        String tmp = s.substring(2, s.length()-4);
        String[] tmpArr = tmp.split("},{");
        Arrays.sort(tmpArr,(s1,s2) -> s1.length() - s2.length());
        Set<Integer> set = new HashSet<>();
        for(String st : tmpArr){
            String[] sss = st.split(",");
            for(String ssss : sss){
                set.add(Integer.parseInt(ssss));
            }
        }
        List<Integer> list = new ArrayList<>(set);
        int[] answer = new int[set.size()];
        for(int i=0; i<answer.length;i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
 
}
