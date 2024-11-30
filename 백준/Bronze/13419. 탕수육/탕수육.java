import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        while(T-- > 0){
            String input = br.readLine();
            Deque<Character> deque = new ArrayDeque<>();
            
            for(char c : input.toCharArray()){
                deque.add(c);
            }
            
            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            
            if(input.length() % 2 == 0){
                for(int i = 0; i < input.length() / 2; i++){
                    char str1 = deque.poll();
                    sb1.append(str1);
                    deque.add(str1);
                    
                    char str2 = deque.poll();
                    sb2.append(str2);
                    deque.add(str2);
                }
            }else {
                for(int i = 0; i < input.length(); i++){
                    char str1 = deque.poll();
                    sb1.append(str1);
                    deque.add(str1);
                    
                    char str2 = deque.poll();
                    sb2.append(str2);
                    deque.add(str2);
                }
            }
            System.out.println(sb1);
            System.out.println(sb2);
        }
    }
}