public class kakaocom3 {
    static int[] answer = new int[2];
    public static int[] solution(int n, int[] passenger, int[][] train) {
        boolean[] check = new boolean[n];
        int sum_pass = 0;

        dfs(0,n,passenger,train,check, sum_pass,0);
        return answer;
    }
    public static void dfs(int start, int n, int[] passenger, int[][] train, boolean[] check, int sum_pass,int j) {
        boolean not_finish_flag = false;
        for(int i=0;i<train.length;i++){
            if(train[i][0] == start+1 && !check[i]){
                not_finish_flag = true;
                break;
            }
        }
        if(!not_finish_flag){
            sum_pass += passenger[train[j][1]-1];
            if(answer[1] == sum_pass){
                answer[0] = Math.max(answer[0], start+1);
            }else{
                if(answer[1] < sum_pass){
                    answer[0] = start+1;
                    answer[1] = sum_pass;
                }
            }
            return ;
        }
        for(int i=0; i<train.length;i++){
            if(!check[i] && train[i][0] == start+1){
                check[i] = true;
                sum_pass += passenger[train[i][0]-1];
                dfs(train[i][1]-1, n, passenger, train, check, sum_pass,i);
                check[i] = false;
                sum_pass -= passenger[train[i][0]-1];
            }
        }
        
    }
    public static void main(String[] args) {
        int n = 4;
        int[] passenger = {2,1,2,2};
        int[][] train = {{1,2},{1,3},{2,4}};// 4 6
        int[] b = solution(n, passenger, train);
        for(int a : b){
            System.out.println(a);
        } 
    }
}
