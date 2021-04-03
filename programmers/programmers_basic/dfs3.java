public class dfs3 {
    static int answer = Integer.MAX_VALUE;
    public static int solution(String begin, String target, String[] words) {
        boolean[] check = new boolean[words.length];

        dfs(begin,target,words,0, check);
        if(answer == Integer.MAX_VALUE){
            answer = 0;
        }
        return answer;
    }
    private static void dfs(String begin, String target, String[] words,int dept, boolean[] check) {
        if(begin == target){
            answer = Math.min(dept, answer);
            return;
        }
        
        for(int i=0;i<words.length;i++){
            int cnt = 0;
            for(int j=0;j<begin.length();j++){
                if(begin.charAt(j) != words[i].charAt(j)){
                    cnt++;
                }
            }
            if(!check[i] && cnt == 1){
                check[i] = true;
                dfs(words[i],target,words,dept+1,check);
                check[i] = false;
            }
        }
    }
    public static void main(String[] args) {
        String begin= "hit";
        String target = "cog";
        String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};
        int answer = solution(begin, target, words);
        System.out.println(answer);
    }
}
