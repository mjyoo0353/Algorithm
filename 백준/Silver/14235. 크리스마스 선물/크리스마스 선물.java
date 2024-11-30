import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        
        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());

            if (a != 0) {
                for (int i = 0; i < a; i++) {
                    queue.add(Integer.parseInt(st.nextToken()));
                }
            } else {
                if (queue.isEmpty()) System.out.println(-1);
                else System.out.println(queue.poll());
            }
        }
    }
}