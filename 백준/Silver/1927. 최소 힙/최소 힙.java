import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < n; i++){
            int input = Integer.parseInt(br.readLine());
            if(input == 0 && pq.isEmpty()){
                sb.append("0\n");
            }else if(input == 0 && !pq.isEmpty()){
                sb.append(pq.poll()).append("\n");
            }else {
                pq.add(input);
            }
        }
        System.out.print(sb);
    }
}