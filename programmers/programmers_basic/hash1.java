import java.util.HashMap;
import java.util.Map;

public class hash1 {
    public static void main(String[] args) {
        String[] participant = new String[]{"a","b","c","a"};
        String[] completion = new String[]{"a","b","c","a","a"};
        String answer = "";
        Map<String,Integer> partMap = new HashMap<>();
        Map<String,Integer> compMap = new HashMap<>();
        
        for(int i =0; i<participant.length;i++){
            if(!partMap.containsKey(participant[i])){
                partMap.put(participant[i], 1);
            }else{
                partMap.put(participant[i], partMap.get(participant[i])+1);
            }
        }
        for(int i =0; i<completion.length;i++){
            if(!compMap.containsKey(completion[i])){
                compMap.put(completion[i], 1);
            }else{
                compMap.put(completion[i], compMap.get(completion[i])+1);
            }
        }
        
        for(String key : partMap.keySet()){
            if(!compMap.containsKey(key) || partMap.get(key)!=compMap.get(key)){
                answer = key;
            }
        }
    
        System.out.println(answer);
    }
}
