import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //센티가 제일 크면 YES 출력 및 뿅망치 횟수 출력
        //거인이 센티랑 같거나 센티보다 크면 NO 출력 및 뿅망치 사용 후 제일 큰 거인의 키 출력
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); //거인 나라의 인구 수
        int H = Integer.parseInt(st.nextToken()); //센티의 키
        int L = Integer.parseInt(st.nextToken()); //뿅망치 사용 제한 횟수
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int count = 0;
        
        for(int i = 0; i < N; i++) {
            pq.offer(Integer.parseInt(br.readLine()));
        }
        for(int i = 0; i < L; i++) {
            if(pq.peek() < H || pq.peek() == 1) break;
            pq.offer(pq.poll() / 2);
            count++;
        }
        if(pq.peek() < H) System.out.println("YES\n" + count);
        else System.out.println("NO\n" + pq.peek());
    }
}