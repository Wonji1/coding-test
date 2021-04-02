import java.util.Arrays;
import java.util.Comparator;

public class greedy5 {
    public static void main(String[] args) {
        int n = 5;
        int answer =0;
        int[][] costs = {{0,1,1},{0,2,2},{1,2,5},{1,3,3},{2,3,8},{3,4,1}};
        boolean[] connect = new boolean[n];
        int connect_cnt;

        Arrays.sort(costs, new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2) {
                // TODO Auto-generated method stub
                return o1[2] - o2[2];
            }
        });
        connect[costs[0][0]] = true;
        connect[costs[0][1]] = true;
        answer += costs[0][2];
        connect_cnt = 2;
        while(connect_cnt<n){
            for(int i=0;i<costs.length;i++){
                if((!connect[costs[i][0]] && connect[costs[i][1]]) || (!connect[costs[i][1]] && connect[costs[i][0]])){
                    connect[costs[i][0]] = true;
                    connect[costs[i][1]] = true;
                    answer += costs[i][2];
                    break;
                }
            }
        }
        System.out.println(answer);
    }
}
