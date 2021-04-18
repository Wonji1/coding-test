public class tipstown2 {
    public static int solution(int n, int a, int b)
    {
        int answer = 0;
        while(true){
            answer++;
            if((a+1)/2 == (b+1)/2){
                break;
            }
            a = (a+1)/2;
            b = (b+1)/2;
        }
        return answer;
    }
    public static void main(String[] args) {
        int N = 8;
        int A = 4;
        int B = 7;
        int answer = solution(N, A, B);
        System.out.println(answer);
    }
}
