import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class dfs5 {
	List<String> list = new ArrayList<>();
	static String route = "";
	static boolean[] visit;
	
	private void dfs(String[][] tickets, String end, int cnt) {
		route += end + ",";
		
		if(cnt == tickets.length) {
			list.add(route); 
            return;
		}
		
		for(int i = 0; i < tickets.length; i++) {
			String s = tickets[i][0];
            String e = tickets[i][1];
			if(s.equals(end) && !visit[i]) {
				visit[i] = true;
				dfs(tickets, e, cnt + 1);
				visit[i] = false; 
                route = route.substring(0, route.length()-4);
			}
		}
	}
	
	public String[] solution(String[][] tickets) {
		for(int i = 0; i < tickets.length; i++) {
			visit = new boolean[tickets.length];
			String start = tickets[i][0], end = tickets[i][1];
			
			if(start.equals("ICN")) {
				route = start + ","; 
                visit[i] = true; 
				dfs(tickets, end, 1);
			}
		}
		
		Collections.sort(list);
		String[] answer = list.get(0).split(",");

		return answer;
    }
    public static void main(String[] args) {
        String[][] tickets = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}};
        dfs5 dfs5 = new dfs5();
        String[] a = dfs5.solution(tickets);
        for(String s : a){
            System.out.println(s);
        }
    }   
}
