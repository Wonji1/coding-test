import java.util.HashMap;
import java.util.Map;

public class test {
    public static void main(String[] args) {
        String program = "line";
        String[] flag_rules = {"-s STRING", "-n NUMBER", "-e NULL"};
        String[] commands = {"line -s 123 -n HI", "line fun"};
        boolean[] answer = new boolean[commands.length];
        int ansIndex = 0;

        Map<String,String> flagMap = new HashMap<>();

        //flag_rule 지정
        for(String f : flag_rules){
            String[] splitRule = f.split(" ");
            flagMap.put(splitRule[0].substring(1), splitRule[1]);
        }

        for(String command : commands){
            answer[ansIndex] = true;
            //프로그램이 잘못됐을 경우 false
            if(!command.startsWith(program)){
                answer[ansIndex] = false;

            }
            String[] splitCommand = command.split("-");
            if(splitCommand.length == 1){
                answer[ansIndex] = false;
            }
            for(int s =1; s< splitCommand.length;s++){
                String[] splitCommandValue = splitCommand[s].trim().split(" ");
                boolean key_flag = false;
                if(splitCommandValue.length >=3){
                    answer[ansIndex] = false;
                }
                for(String key : flagMap.keySet()){
                    if(key.equals(splitCommandValue[0])){key_flag = true;}
                    if(flagMap.get(key).equals("NULL") && splitCommandValue[0].equals(key) && splitCommandValue.length != 1){
                        answer[ansIndex]=false;
                    }
                    else if(!flagMap.get(splitCommandValue[0]).equals("NULL") && splitCommandValue.length == 1){
                        answer[ansIndex] = false;
                    }
                    else if(key.equals(splitCommandValue[0])){
                        if(flagMap.get(key).equals("NUMBER")){
                            char tmp;
                            for(int i=0; i<splitCommandValue[1].length();i++){
                                tmp = splitCommandValue[1].charAt(i);

                                if(Character.isDigit(tmp) == false){
                                    answer[ansIndex] = false;
                                    break;
                                }
                            }
                        }
                    }
                }
                if(key_flag == false){
                    answer[ansIndex] = false;
                }
            }



            ansIndex++;
        }
        for(boolean i : answer){
            System.out.println(i);
        }
    }
}
