public class test {
    public static int solution(String[] strs, String t) {
        int answer = 0;
        int[] dp = new int[t.length()];
        for(int i= 0; i<dp.length;i++){
            dp[i] = 20001;
        }
        for(int i=0 ; i< t.length();i++){
            for(String str : strs){
                if(str.length() <= i+1 && t.substring(i-str.length()+1, i+1).equals(str)){
                    if(str.length() == i+1){
                        dp[i] = 1;
                    }
                    else if(str.length()<i+1 && dp[i-str.length()] != 0){
                        dp[i] = Math.min(dp[i], dp[i-str.length()]+1);
                    }
                }
            }
        }
        answer = dp[t.length()-1];
        if(answer == 20001){
            answer =-1;
        }
        return answer;
    }
    public static void main(String[] args) {
        String[] strs = {"app","ap","p","l","e","ple","pp"};
        String t = "apple";
        int answe = solution(strs, t);
        System.out.println(answe);
    }
}
