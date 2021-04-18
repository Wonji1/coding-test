import java.util.Stack;

public class tipstown1 {
    public static int solution(String s)
    {
        int answer = 0;
        Stack<Character> st = new Stack<>();
       
        for(char c : s.toCharArray()){
            if(st.isEmpty() || st.peek() != c){
                st.push(c);
            }else{
                st.pop();
            }
        }
        if(st.size() == 0){
            answer = 1;
        }
        return answer;
    }
    public static void main(String[] args) {
        String s = "baabaa";
        int answer = solution(s);
        System.out.println(answer);
    }
}
