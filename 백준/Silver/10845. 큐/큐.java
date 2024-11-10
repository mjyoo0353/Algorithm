import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String input = st.nextToken();
            
            if(input.equals("push")){
                queue.add(Integer.parseInt(st.nextToken()));
            }else if(input.equals("pop")){
                if(!queue.isEmpty()) sb.append(queue.poll()).append("\n");
                else sb.append("-1").append("\n");
            }else if(input.equals("size")){
                sb.append(queue.size()).append("\n");
            }else if(input.equals("empty")){
                if(!queue.isEmpty()) sb.append("0").append("\n");
                else sb.append("1").append("\n");
            }else if(input.equals("front")){
                if(!queue.isEmpty()) sb.append(queue.peek()).append("\n");
                else sb.append("-1").append("\n");
            }else {
                if(!queue.isEmpty()) sb.append(queue.toArray()[queue.size()-1]).append("\n");
                else sb.append("-1").append("\n");
            }
        }
        System.out.println(sb);
    }
}