import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class meister3 {
    static List<Integer> list = new ArrayList<>();
    public static int solution(String arr[]) {
        int answer = 1;
        int val = Integer.parseInt(arr[0]);
        dfs(arr,val, 0);
        Collections.sort(list, (o1,o2) -> o2-o1);
        answer = list.get(0);
        return answer;
    }
    private static void dfs(String[] arr, int val, int depth) {
        if(depth +1 == arr.length){
            list.add(val);
            return;
        }
        boolean flag = false;
        int tmp = 0;
        String first = arr[depth+1];
        while(depth < arr.length-2){
            depth += 2;
            if(!flag){
                flag = true;
                tmp = Integer.parseInt(arr[depth]); 
            }else{
                if(arr[depth-1].equals("-")){
                    tmp -= Integer.parseInt(arr[depth]);
                }
                else if(arr[depth-1].equals("+")){
                    tmp += Integer.parseInt(arr[depth]);
                }
            }
            if(first.equals("-")){
                dfs(arr,val-tmp, depth);
            }else if (first.equals("+")){
                dfs(arr,val+tmp,depth);
            }

        }
    }
    public static void main(String[] args) {
        String[] arr = {"5", "-", "3", "+", "1", "+", "2", "-", "4"};
        int answer = solution(arr);
        System.out.println(answer);
    }
}
