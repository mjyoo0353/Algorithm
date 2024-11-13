import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();
        int count = 0;
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        
        for(char c : input.toCharArray()){
            if(Character.isDigit(c)){
                count++;
            }else if(c == 'L'){
                stack1.add(c);
            }else if(c == 'S'){
                stack2.add(c);
            }else if(c == 'R'){
                if(!stack1.isEmpty()){
                    count++;
                    stack1.pop();
                }else {
                    break;
                }
            }else if(c == 'K'){
                if(!stack2.isEmpty()){
                    count++;
                    stack2.pop();
                }else {
                    break;
                }
            }
        }
        System.out.println(count);
    }
}