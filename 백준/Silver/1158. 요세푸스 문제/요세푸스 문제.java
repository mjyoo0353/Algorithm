import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // N: 사람의 수, K: 제거할 간격
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        // 큐를 사용하여 요세푸스 순열 구현
        Queue<Integer> queue = new ArrayDeque<>();
        
        // 1부터 N까지의 숫자를 큐에 삽입
        for(int i = 1; i <= N; i++){
            queue.add(i);
        }
        
        // 결과를 저장할 StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        while(!queue.isEmpty()){
            for(int i = 1; i < K; i++){
                // K-1번 반복하여 K번째 사람 전까지 큐의 앞에서 빼서 뒤로 삽입
                queue.add(queue.poll());
            }
            // K번째 사람을 제거하고 결과에 추가
            sb.append(queue.poll());
            // 큐가 비어 있지 않으면 쉼표와 공백 추가
            if(!queue.isEmpty()){
               sb.append(", ");
            }
        }
        sb.append(">");
        System.out.println(sb.toString());
    }
}