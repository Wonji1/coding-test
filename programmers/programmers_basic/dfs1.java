public class dfs1 {
    public static int[] n;
    public static int t;
    public static int answer=0;
    public static void dfs(int index,int val){
        if(index>=n.length){
            if(val == t){
                answer++;
            }
            return;
        }
        dfs(index+1, val+n[index]);
        dfs(index+1, val-n[index]);
    }

    public static int solution(int[] numbers, int target) {
        n= numbers;
        t = target;
        dfs(0,0);
        return answer;
    }
    public static void main(String[] args) {
        int[] numbers = {1,1,1,1,1};
        int target =3;
        solution(numbers, target);
        System.out.println(answer);
    }
}
