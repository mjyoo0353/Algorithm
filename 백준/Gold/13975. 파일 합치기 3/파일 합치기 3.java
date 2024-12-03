import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); //테스트 케이스

        for (int i = 0; i < T; i++) {
            int K = Integer.parseInt(br.readLine()); // 소설을 구성하는 장의 수
            PriorityQueue<Long> pq = new PriorityQueue<>();

            StringTokenizer st = new StringTokenizer(br.readLine()); //1장부터 K장까지 수록한 파일의 크기
            for (int j = 0; j < K; j++) {
                pq.add(Long.parseLong(st.nextToken()));
            }

            long sum = 0;
            while(true){
                if(pq.size() == 1) break;
                long num1 = pq.poll();
                long num2 = pq.poll();
                sum += num1 + num2;
                pq.add(num1 + num2);
            }
            System.out.println(sum);
        }
    }
}