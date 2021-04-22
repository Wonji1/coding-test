public class S_W_coding1_2 {
    public static int solution(int[] nums) {
        int answer =0;
        for(int i=0; i< nums.length-2;i++){
            for(int j=i+1; j< nums.length-1;j++){
                for(int k= j+1; k<nums.length;k++){
                    if(isPrime(nums[i]+nums[j]+nums[k])){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
    public static boolean isPrime(int num){
        if(num <2){
            return false;
        }
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] nums ={1,2,7,6,4};
        int answer = solution(nums);
        System.out.println(answer);
    }
}
