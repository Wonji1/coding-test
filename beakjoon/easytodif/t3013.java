package easytodif;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class t3013 {
    static int answer =0;
    static Set<List<Integer>> set = new HashSet<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        int target_idx=0;
        for(int i=0; i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if(arr[i] == target){
                target_idx = i;
            }
        }
        dfs(arr,target,target_idx,0,n-1);
        System.out.println(set.size());
        
    }
    public static void dfs(int[] arr, int target, int target_idx, int start, int end){
        if(start > end || start> target_idx || end < target_idx){
            return;
        }
        if((end-start)%2 == 0 ){       
            List<Integer> list = new ArrayList<>();
            for(int i= start; i<= end;i++){
                list.add(arr[i]);
            }
            Collections.sort(list);
            if(list.get(list.size()/2) == target){
                set.add(list);
            }
        }
        dfs(arr,target,target_idx,start+1, end);
        dfs(arr,target,target_idx,start, end-1);
        dfs(arr,target,target_idx,start+1, end-1);
        
    }

}