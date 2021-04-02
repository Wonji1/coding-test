public class dp1 {
    public static int answer = Integer.MAX_VALUE;
    public static int n;
    public static int target;
    public static void dfs(int count, int val){
        if(count >8){
            answer = -1;
            return;
        }
        if(val == target){
            answer = Math.min(answer, count);
            return;
        }
        int tmpN = n;
        for(int i=0;i<8-count;i++){
            int newCount = count + i + 1;
            dfs(newCount,val+tmpN);
            dfs(newCount,val-tmpN);
            dfs(newCount,val/tmpN);
            dfs(newCount,val*tmpN);
            tmpN = tmpN*10 +n;
        }
    }
    public static int solution(int N, int number) {
        n = N;
        target = number;
        dfs(0,0);
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(5, 12));

    }
}
