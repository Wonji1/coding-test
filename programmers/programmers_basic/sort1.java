import java.util.Arrays;

public class sort1 {
    public static void main(String[] args) {
        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
        int[] answer = new int[commands.length];
        for(int i=0; i<commands.length;i++){
            int cnt = 0;
            int[] tmpArr = new int[commands[i][1]-commands[i][0] +1];
            
            for(int j=commands[i][0]-1;j<= commands[i][1]-1;j++){
                tmpArr[cnt++] = array[j];
            }
            Arrays.sort(tmpArr);
            answer[i] = tmpArr[commands[i][2]-1];
        }
    }
}
