import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class perfectFind2 {
    private static Set<Integer> set = new HashSet<>();

    public static boolean check(int x) {
        if (x == 0 || x == 1) {
            return false;
        }else {
            boolean flag = true;
            for (int i=2; i<x; i++) {
                if (!flag) {
                    break;
                }else if(x%i == 0){
                    flag = false;
                }
            }
            return flag;
        }
    }

    public static void dfs(ArrayList<String> arr,String s, int count, int number) {

        count++;
        if (count > number) {
            return;
        }
        for (int i=0; i<arr.size(); i++) {
            set.add(Integer.parseInt(s+arr.get(0)));
            String temp = arr.get(0);
            arr.remove(0);
            dfs(arr,s+temp,count,number);
            arr.add(temp);

        }
    }

    public static void main(String[] args) {
        String numbers = "011";
                ArrayList<String> arr = new ArrayList<>();

        for (String s:numbers.split("")) {
            arr.add(s);
        };

        int length = numbers.length();
        dfs(arr,"",0,length);

        int answer = 0;
        for (int i: set) {
            if (check(i)) {
                answer++;
            }
        }
        System.out.println(answer);
        
    }
}
