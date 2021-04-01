public class stackque2 {
    public static void main(String[] args) {
        int[] prices = {1,2,3,2,3};
        int cnt = 0;
        for(int i =0; i<prices.length-1;i++){
            cnt = 0;
            for(int j=i+1;j<prices.length;j++){
                if(prices[i]<= prices[j]){
                    cnt++;
                }
                else{break;}
            }
            if(cnt ==0){
                cnt =1;
            }
            prices[i] = cnt;
        }
        prices[prices.length-1] = 0;
        for(int i =0; i<prices.length;i++){
            System.out.println(prices[i]);
        }
    }
}
