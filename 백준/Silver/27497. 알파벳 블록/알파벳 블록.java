import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<String> deque = new ArrayDeque<>();
        Stack<Boolean> stack = new Stack<>();

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());

            if(num == 1){
                String str = st.nextToken();
                deque.addLast(str);
                stack.add(true);
            }else if(num == 2){
                String str = st.nextToken();
                deque.addFirst(str);
                stack.add(false);
            }else {
                if(!deque.isEmpty()){
                    if(stack.pop()){
                        deque.pollLast();
                    }else{
                        deque.pollFirst();
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        if(deque.isEmpty()) System.out.println(0);
        else{
            for(String s : deque){
                sb.append(s);
            }
        }
        System.out.println(sb);
    }
}