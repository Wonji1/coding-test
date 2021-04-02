import java.util.Arrays;

public class greedy4 {
    public static void main(String[] args) {
        int[] people = {70,50,80,50};
        int limit = 100;
        int answer = 0;
        Arrays.sort(people);
        int front =0;
        int back = people.length-1;
        
        while (people[front] != 0){
            if(people[front] + people[back] <= limit){
                people[front] =0;
                people[back] = 0;
                answer++;
                front++;
                back--;
            }else{
                people[back] = 0;
                answer++;
                back--;
            }
        }
        System.out.println(answer);
    }
}
