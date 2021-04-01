import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class li_test {
    public static void main(String[] args) {
        String[] table = {"SI JAVA JAVASCRIPT SQL PYTHON C#", "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++", "HARDWARE C C++ PYTHON JAVA JAVASCRIPT", "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP", "GAME C++ C# JAVASCRIPT C JAVA"};
        String[] languages = {"JAVA", "JAVASCRIPT"};
        int[] preference = {7,5};
        List<String> tableSortList = new LinkedList<>();
        Map<String,List<String>> tableMap = new HashMap<>();
        for(String s : table){
            String[] spliteString = s.split(" ");
            List<String> scoreList = new LinkedList<>();
            for(int i =spliteString.length-1;i>0;i--){
                scoreList.add(spliteString[i]);
            }
            tableMap.put(spliteString[0], scoreList);
            tableSortList.add(spliteString[0]);
        }
        List<Integer> sumList = new LinkedList<>();
        for(String key : tableSortList){
            int sum = 0;
            List<String> scoreList = tableMap.get(key);
            for(int i=0; i<languages.length;i++){
                String language = languages[i];
                int pre = preference[i];

                int score = scoreList.indexOf(language)+1;
                sum += (pre*score);
            }
            sumList.add(sum);
        }
        int max = Integer.MIN_VALUE;
        int maxIndex =0 ;
        for(int i=0; i<sumList.size();i++){
            if (max < sumList.get(i)){
                max = sumList.get(i);
                maxIndex = i;
            }
            else if (max == sumList.get(i)){
                if(tableSortList.get(maxIndex).compareTo(tableSortList.get(i))>0){
                    max = sumList.get(i);
                    maxIndex = i;
                }
            }
        }
        System.out.println(tableSortList.get(maxIndex));
    }
}
