public class S_W_coding1_9 {
    public static int solution(int n, int[] stations, int w) {
        int answer = 0;
        double width = w*2 +1;
        if(w < stations[0]){
            double cnt = stations[0] - w -1;
            answer += (int)Math.ceil(cnt/width);
        }
        for(int i =1 ; i< stations.length;i++){
            double cnt = stations[i]-w - stations[i-1]+w -1;
            if(cnt>0){
                answer += (int)Math.ceil(cnt/width);
            }
        }
        if(n- stations[stations.length-1]> 0){
            double cnt = n - (stations[stations.length-1]+w);
            answer += (int)Math.ceil(cnt/width);
        }
        return answer;

    }
    public static void main(String[] args) {
        int N = 16;
        int[] stations ={9};
        int W = 2;
        int answer = solution(N, stations, W);
        System.out.println(answer);
    }
    
}
