public class backChallenge3 {
    public static int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        int[] rst = new int[enroll.length];
        boolean[] check = new boolean[enroll.length];

        dfs(0,enroll,referral,seller,amount,rst, check);
        return rst;
    }
    public static void dfs(int idx, String[] enroll, String[] referral, String[] seller, int[] amount, int[] rst, boolean[] check) {
        
        if(idx>=seller.length){
            return;
        }
            for(int j=0; j< enroll.length;j++){
                if(enroll[j].equals(seller[idx]) && !check[j]){
                    rst[j] = amount[idx]*100;
                    check[j] = true;
                    if(referral[j].equals("-")){
                        break;
                    }else{
                        rst[j] -= amount[idx]*100/10;
                        for(int k=0;k<enroll.length;k++){
                            if(referral[j].equals(enroll[k])){
                                rst[k] += amount[idx]*100/10;
                                break;
                            }
                        }
                        
                        dfs(idx+1, enroll, referral, seller, amount, rst, check);
                    }
                }
            }
        
    }
    public static void main(String[] args) {
        String[] enroll = {"john", "mary", "edward", "sam", "emily", "jaimie", "tod", "young"};
        String[] referral = {"-", "-", "mary", "edward", "mary", "mary", "jaimie", "edward"};
        String[] seller = {"young", "john", "tod", "emily", "mary"};
        int[] amount = {12, 4, 2, 5, 10};
        //rst = [360, 958, 108, 0, 450, 18, 180, 1080];
        int[] answer =solution(enroll, referral, seller, amount);
        for(int a : answer){
            System.out.println(a);
        }
    }
}
