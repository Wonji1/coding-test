public class S_W_coding1_6 {
    public static int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for(String st : skill_trees){
            int point_idx = -1;
            boolean flag = false;
            int cnt = 0;
            for(int i = 0 ; i<skill.length();i++){
                for(int j = 0; j<st.length(); j++){
                    if(skill.charAt(i) == st.charAt(j)){
                        if(point_idx< j){
                            if(cnt != i){
                                flag = true;
                                break;
                            }
                            point_idx = j;
                            cnt++;
                            break;
                        }else{
                            flag = true;
                            break;
                        }
                    }
                }
            }
            if(!flag){
                answer++;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        String skill = "CBD";
        String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
        int answer = solution(skill, skill_trees);
        System.out.println(answer); 
    }
}
