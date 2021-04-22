public class S_W_coding1_12 {
    public static int solution(int[] cookie) {
        int answer =0;
        for(int i=0; i<cookie.length-1;i++){
            int first = i;
            int first_sum = cookie[i];
            int second = i+1;
            int second_sum = cookie[i+1];

            while(true){
                if( first_sum == second_sum){
                    answer = Math.max(answer,first_sum);
                }else if(first_sum > second_sum && second != cookie.length-1){
                    second++;
                    second_sum += cookie[second];
                }else if(first_sum < second_sum && first != 0){
                    first--;
                    first_sum += cookie[first];
                }else{
                    break;
                }
            }
        
        }


        return answer;
    }
    public static void main(String[] args) {
        int[] cookie = {1,1,2,3};
        int answer = solution(cookie);
        System.out.println(answer);
    }
}
