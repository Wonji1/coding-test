import java.util.HashMap;
import java.util.Map;

public class hash2 {
    public static void main(String[] args) {
        boolean answer = true;
        String[] phone_book= {"119", "97674223", "1195524421"};
        Map<String,Object> pMap = new HashMap<>();

        for(int i = 0; i<phone_book.length;i++){
            pMap.put(phone_book[i], "prefix");
        }

        for(String key : pMap.keySet()){
            for(int i =0; i<key.length();i++){
                if(pMap.containsKey(key.substring(0, i))){
                    answer = false;
                }
            }
        }
        System.out.println(answer);
    }
}
