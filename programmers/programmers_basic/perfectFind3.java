public class perfectFind3 {
    public static void main(String[] args) {
        int[] answer = new int[2];
        int brown = 24;
        int yellow = 24;
        int x,y;

        for(int i=2;i<brown/2;i++ ){
            x = i;
            if((brown+yellow)%x ==0){
                y = (brown+yellow)/x;
            }
            else{
                continue;
            }
            y = (brown+yellow)/x;
            if(2*x + (y-2)*2 == brown){
                answer[0] = x;
                answer[1] = y;
            }
        }
    }
}
