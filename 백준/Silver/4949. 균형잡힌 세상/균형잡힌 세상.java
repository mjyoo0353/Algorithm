import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true){
            String input = br.readLine();
            Stack<Character> stack = new Stack<>();
            
            if(input.equals(".")) break;
            
            for(int i = 0; i < input.length(); i++){
                char ch = input.charAt(i);
                if(ch == '(' || ch == '[') stack.push(ch);
                if(ch == ')'){
                    if(stack.isEmpty()){
                        stack.push(ch);
                        break;
                    }
                    if(stack.peek() == '(') stack.pop();
                    else break;
                }else if(ch == ']'){
                    if(stack.isEmpty()){
                        stack.push(ch);
                        break;
                    }
                    if(stack.peek() == '[') stack.pop();
                    else break;
                }
            }
            if(stack.isEmpty()) System.out.println("yes");
            else System.out.println("no");
        }
    }
}