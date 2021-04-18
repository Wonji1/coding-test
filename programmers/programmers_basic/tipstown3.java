import java.util.Arrays;

public class tipstown3 {
    static int answer = Integer.MAX_VALUE;
    public static int solution(String[] strs, String t) {
        Arrays.sort(strs, (s1,s2) -> s2.length() - s1.length());
        dfs(strs, t,0, "");
        if(answer == Integer.MAX_VALUE){
            answer = -1;
        }
        return answer;
    }
    public static void dfs(String[] strs, String t,int depth, String val){
        if(val.length() > t.length() || !val.equals(t.substring(0, val.length()))){
            return;
        }
        if(val.equals(t)){
            answer = Math.min(answer,depth);
            return;
        }
        for(int i=0; i< strs.length;i++){
            dfs(strs, t, depth+1, val+strs[i]);
        }
    }
    public static void main(String[] args) {
        String[] strs = {"app","ap","p","l","e","ple","pp"};
        String t = "apple";
        int answe = solution(strs, t);
        System.out.println(answe);
    }
}
