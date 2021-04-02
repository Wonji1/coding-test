public class greedy1 {
    public static void main(String[] args) {
        int n = 5;
        int[] lost = {2,4};
        int[] reverse = {1,3,5};
        int[] student = new int[n];
        int answer =0;

        for(int l: lost){
            student[l-1]--;
        }
        for(int r : reverse){
            student[r-1]++;
        }

        for(int i=0; i<n;i++){
            if(student[i] <0){
                if(i!=0 && student[i-1] >0){
                    student[i]++;
                    student[i-1]--;
                }else if ( i!= n-1 && student[i+1] >0){
                    student[i]++;
                    student[i+1]--;
                }
            }
        }
        for(int s : student){
            if (s >=0){
                answer++;
            }
        }
        System.out.println(answer);
    }
}
