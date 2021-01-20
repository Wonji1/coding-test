package easytodif;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class backtracking_15650 {
	public static int[] arr;
	public static boolean[] check;
	public static StringBuilder sb = new StringBuilder();

	public static void dfs(int n, int m ,int cnt){
		if(cnt == m){
			for(int val:arr){
				sb.append(val).append(' ');
			}
			sb.append('\n');
			return;
		}
		for(int i =0; i<n ;i++){
			if (!check[i]){
				if(cnt==0 || arr[cnt-1]<i+1){ 
					check[i]=true;
					arr[cnt] = i+1;
					dfs(n,m,cnt+1);
					check[i] = false;
				}
			}
		}
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		arr = new int[m];
		check = new boolean[n];
		dfs(n,m ,0);			
		System.out.println(sb);
	}
	
}