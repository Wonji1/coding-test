package easytodif;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String2941{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s =  br.readLine();
        int cnt = 0;
        for (int i=0; i<s.length();i++){
            cnt++;
            switch(s.charAt(i)){
                case 'c':
                if(i < s.length()-1 &&  (s.charAt(i+1) == '=' || s.charAt(i+1) == '-')){i += 1;}
                break;
                case 'd':
                if(i < s.length()-2 && (s.charAt(i+1) == 'z'&& s.charAt(i+2) == '=')){
                    i+= 2;
                }
                else if (i != s.length()-1 && s.charAt(i+1) == '-'){
                    i+=1;
                }
                break;
                case 'l':
                if(i != s.length()-1 &&s.charAt(i+1) == 'j'){i += 1;}
                break;
                case 'n':
                if(i != s.length()-1 && s.charAt(i+1) == 'j'){i += 1;}
                break; 
                case 's' :
                if(i != s.length()-1 && s.charAt(i+1) == '='){i += 1;}
                break;
                case 'z':
                if(i != s.length()-1 && s.charAt(i+1) == '='){i += 1;}
                break;
                default:
            }
        }
        System.out.println(cnt);
    }
}