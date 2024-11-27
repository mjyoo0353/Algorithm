import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0; // 조건을 만족하는 문자열의 개수
        
        for(int i = 0; i < N; i++){
            String input = br.readLine();
            Stack<Character> stack = new Stack<>();
            
            for(int j = 0; j < input.length(); j++){
                //stack이 비어있지 않고 현재 문자가 스택의 최상단 문자와 같으면
                if(stack.size() > 0 && input.charAt(j) == stack.peek()){
                    stack.pop(); //stack의 최상단 문자 제거
                }else {
                    stack.push(input.charAt(j)); //stack에 현재 문자 추가
                }
            }
            //stack이 비어 있다면 조건을 만족하는 문자열로 간주
            if(stack.isEmpty()) count++;
        }
        //조건을 만족하는 문자열의 개수 출력
        System.out.println(count);
    }
}