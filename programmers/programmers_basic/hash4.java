import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class hash4 {
    public static void main(String[] args) {
        int[] answer= {};
        String[] genres = {"pop","pop","pop","rap","rap"};
        int[] plays = {45,50,40,60,70};
        Map<String,List<Integer>> playMap = new HashMap<>();
        Map<String,Integer> totalMap = new HashMap<>();
        Map<Integer,String> reverseTotMap = new HashMap<>();
        List<Integer> sortArr = new ArrayList<>();
        for (int i=0;i<genres.length;i++){
            totalMap.put(genres[i], totalMap.getOrDefault(genres[i], 0)+plays[i]);
            List<Integer> list = playMap.get(genres[i]);
            if(list == null){
                list = new ArrayList<>();
                playMap.put(genres[i], list);
            }
            list.add(i);
            playMap.put(genres[i], list);
        }
        for(String key: totalMap.keySet()){
            sortArr.add(totalMap.get(key));
            reverseTotMap.put(totalMap.get(key), key);
        }
        Collections.sort(sortArr);
        Collections.reverse(sortArr);

        
        List<Integer> ans = new ArrayList<>();
        for(int skey: sortArr){
            int maxFist = 0;
            int maxSecond = 0;
            int indexFirst = -1;
            int indexSecond = -1;
            String genre = reverseTotMap.get(skey);
            List<Integer> indexList = playMap.get(genre);
            for (int i : indexList){
                if(maxFist == plays[i]){
                    if(maxSecond != maxFist){
                        maxSecond = maxFist;
                        indexSecond = i;
                    }
                }
                else if(maxFist< plays[i]){
                    maxSecond = maxFist;
                    maxFist = plays[i];
                    indexSecond = indexFirst;
                    indexFirst = i;
                }
                else if (maxFist>plays[i] && maxSecond<plays[i]){
                    maxSecond = plays[i];
                    indexSecond = i;
                }
            }
            ans.add(indexFirst);
            if(indexList.size() != 1){
                ans.add(indexSecond);
            }
        }
        answer = new int[ans.size()];
        for(int i=0; i<ans.size();i++){
            answer[i] = ans.get(i);
            System.out.println(answer[i]);
        }
        
    }
}
