package easytodif;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class perfect_12015 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] tmp = br.readLine().split(" ");
        int[] nums = new int[n];
        for(int i=0; i<n ; i++){
            nums[i] = Integer.parseInt(tmp[i]);
        }
        List<Integer> list = new ArrayList<>();
        list.add(0);
        for(int i=0; i<n ;i++){
            if(list.get(list.size()-1) <nums[i]){
                list.add(nums[i]);
            }else{
                int first = 0;
                int last = list.size()-1;
                while(first < last){
                    int mid = (first+last)/2;
                    if(list.get(mid) < nums[i]){
                        first = mid+1;
                    }else if(list.get(mid) >= nums[i]){
                        last = mid;
                    }
                }
                list.set(last, nums[i]);
            }
        }
        System.out.println(list.size()-1);
    }
}
