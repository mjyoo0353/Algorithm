import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i = 0; i < n; i++){
            int input = Integer.parseInt(br.readLine());
            if(input == 0 && pq.isEmpty()){
                System.out.println(0);
            }else if(input == 0 && !pq.isEmpty()){
                System.out.println(pq.poll());
            }else {
                pq.add(input);
            }
        }
    }
}