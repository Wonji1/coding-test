import java.util.Arrays;
import java.util.Comparator;

public class greedy6 {
    public static void main(String[] args) {
        int[][] routes = {{-20,15},{-14,-5},{-18,-13},{-5,-3}};
        int answer = 0;
        Arrays.sort(routes, new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2) {
                // TODO Auto-generated method stub
                return o1[1] - o2[1];
            }
            
        });
        int min = routes[0][1];
        answer++;
        for(int[] r : routes){
            if(min < r[0]){
                min = r[1];
                answer++;
            }
        }
        System.out.println(answer);
    }
}
