import java.util.Arrays;
import java.util.PriorityQueue;

public class S_W_coding1_7 {
    public static int solution(int N, int[][] road, int K) {
        int answer =0;
        int[] dist = new int[N+1];
        Arrays.fill(dist, 500001);
        PriorityQueue<node> pq = new PriorityQueue<>();
        pq.offer(new node(0, 1));

        while(!pq.isEmpty()){
            node n = pq.poll();
            if(dist[n.here] < n.cost){
                continue;
            }
            for(int i =0; i<road.length;i++){
                if(road[i][0] == n.here){
                    if(n.cost+ road[i][2] < dist[road[i][1]]){
                        dist[road[i][1]] = n.cost+road[i][2];
                        pq.offer(new node(n.cost+road[i][2], road[i][1]));
                    }
                }else if(road[i][1] == n.here){
                    if(n.cost+ road[i][2] < dist[road[i][0]]){
                        dist[road[i][0]] = n.cost+road[i][2];
                        pq.offer(new node(n.cost+road[i][2], road[i][0]));
                    }
                }
            }
        }
        for(int d : dist){
            if(d <= K){
                answer++;
            }
        }
        return answer;
    }
    public static class node implements Comparable<node>{
        int cost;
        int here;

        node(int cost,int here){
            this.cost = cost;
            this.here = here;
        }
        @Override
        public int compareTo(node n){
            return this.cost - n.cost;
        }

    }
    public static void main(String[] args) {
        int N = 6;
        int[][] road = {{1,2,1},{1,3,2},{2,3,2},{3,4,3},{3,5,2},{3,5,3},{5,6,1}};  
        int K = 4;

        int answer = solution(N, road, K);
        System.out.println(answer);
    }
}
