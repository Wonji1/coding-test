public class dfs2 {
    public static int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] check = new boolean[n];

        for(int i=0;i<n;i++){
            if(!check[i]){
                answer++;
                dfs(i,computers,check);
            }
        }
        return answer;
    }
    private static void dfs(int i, int[][] computers, boolean[] check) {
        check[i] = true;
        for(int j=0;j<computers[i].length;j++){
            if(!check[j] && computers[i][j] == 1){
                dfs(j,computers,check);
            }
        }
    }
    public static void main(String[] args) {
        int n = 3;
        int[][] computers = {{1,1,0},{1,1,0},{0,0,1}};
        int answer = solution(n, computers);
        System.out.println(answer);
    }
}
