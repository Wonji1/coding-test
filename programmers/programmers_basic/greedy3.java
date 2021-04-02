public class greedy3 {
    public static void main(String[] args) {
        String number = "3211234";
        int k = 3;
        int idx = 0;
        char max;
	    StringBuilder answer = new StringBuilder();
    
	    // if(number.charAt(0) == '0') return "0";
	    for(int i = 0; i < number.length() - k; i++) {
		max = '0';
		for(int j = idx; j <= k + i; j++) {
	        	if(max < number.charAt(j)) {
	        		max = number.charAt(j); idx = j + 1;
	        	}
		}			
		answer.append(max);
	}
        System.out.println(answer.toString());
    }
}
