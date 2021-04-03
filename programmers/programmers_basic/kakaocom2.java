public class kakaocom2 {
    public static int answer = Integer.MIN_VALUE;
    public static int[][] deepCopy(int[][] needs) {
        if(needs == null) return null;
        int[][] result = new int[needs.length][needs[0].length];
         
        for(int i=0; i<needs.length; i++){
            System.arraycopy(needs[i], 0, result[i], 0, needs[0].length);
        }
         
        return result;
    }

    public static int solution(int[][] needs, int r) {
        boolean[] check = new boolean[needs[0].length];
        dfs(needs, r, 0, check);
        return answer;
    }
    public static void dfs(int[][] needs, int r, int robot, boolean[] check){
        robot++;
        if(robot>r){
            int[][] needsTmp = deepCopy(needs);
            for(int i=0;i<check.length;i++){
                if(check[i]){
                    for(int j=0;j<needs.length;j++){
                        needsTmp[j][i] = 0;
                    }
                }
            }
            int cnt =0;
            for(int i=0; i<needsTmp.length;i++){
                for(int j=0;j<needsTmp[i].length;j++){
                    if(needsTmp[i][j] == 1){
                        cnt++;
                        break;
                    }
                }
            }
            answer = Math.max(answer, needs.length-cnt);
            System.out.println(answer);
            return;
        }
        for(int i=0;i<needs[0].length;i++){
            if(!check[i]){
                check[i] = true;
                dfs(needs, r, robot, check);
                check[i] = false;
            }
        }
        
    }
    public static void main(String[] args) {
        int[][] needs = {{ 1, 0, 0 }, {1, 1, 0}, {1, 1, 0}, {1, 0, 1}, {1, 1, 0}, {0, 1, 1} };
        int r = 2;
        int answer = solution(needs, r);
        System.out.println(answer);
    }
}
