package easytodif;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class stack_10818 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<n ;i++){
            String s = br.readLine();
            String[] tmp = s.split(" ");
            switch(tmp[0]){
                case "push":
                stack.add(Integer.parseInt(tmp[1]));
                break;
                case "top":
                if(stack.isEmpty()){
                    break;
                }
                System.out.println(stack.peek());
                break;
                case "size":
                System.out.println(stack.size());
                break;
                case "empty":
                if(stack.isEmpty()){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
                break;
                case "pop":
                if(!stack.isEmpty()){
                    System.out.println(stack.pop());
                }else{
                    System.out.println(-1);
                }
                break;
            }
        }
        
    }
}
