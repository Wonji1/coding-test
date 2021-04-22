public class S_W_coding1_11 {
    public static long solution(int[][] land, int P, int Q) {
        long answer = Long.MAX_VALUE;
        long first = 0;
        long last = 1000000000;
        while(first<=last){
            long mid = (first+last)/2;
            long cnt = 0;
            long cnt2 = 0;
            for(int[] lan : land){
                for(int l : lan){
                    if(mid > l){
                        cnt += (mid-l) * P;
                    }else{
                        cnt += (l-mid) * Q;
                    }
                    if(mid+1 > l){
                        cnt2 += (mid+1-l) * P;
                    }else{
                        cnt2 += (l-mid+1) * Q;
                    }
                }
            }
            if(cnt <= cnt2){
                answer = Math.min(cnt,answer);
                last = mid-1;
            }else{
                answer = Math.min(cnt,answer);
                first = mid+1;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int[][] land = {{1, 2}, {2, 3}};
        int P =3;
        int Q = 2;
        long answer = solution(land, P, Q);
        System.out.println(answer);
    }
    
}
