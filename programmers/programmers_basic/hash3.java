import java.util.HashMap;   
import java.util.Map;

public class hash3 {
    public static void main(String[] args) {
        int answer =1;
        String[][] clothes = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
        Map<String,Integer> cMap = new HashMap<>();

        for(int i=0; i<clothes.length;i++){
            if(cMap.containsKey(clothes[i][1])){
                cMap.put(clothes[i][1], cMap.get(clothes[i][1])+1);
            }else{
                cMap.put(clothes[i][1], 1);
            }
        }
        for(String key : cMap.keySet()){
            answer = answer * (cMap.get(key)+1);
        }
        answer = answer -1;
        System.out.println(answer);
    }
}
