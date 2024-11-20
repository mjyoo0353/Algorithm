import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int dasom = Integer.parseInt(br.readLine());
        int count = 0;
        
        for(int i = 1; i < N; i++){
            pq.add(Integer.parseInt(br.readLine()));
        }
        while(!pq.isEmpty() && dasom <= pq.peek()){
            dasom++;
            pq.add(pq.poll() - 1);
            count++;
        }
        System.out.println(count);
    }
}