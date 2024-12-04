import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); //책의 개수
        int M = Integer.parseInt(st.nextToken()); //한 번에 들 수 있는 책의 개수
        PriorityQueue<Integer> positive = new PriorityQueue<>(Collections.reverseOrder()); //좌표 양수를 저장할 우선순위 큐
        PriorityQueue<Integer> negative = new PriorityQueue<>(Collections.reverseOrder()); //좌표 음수를 저장할 우선순위 큐

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int input = Integer.parseInt(st.nextToken()); //책의 원래 위치
            if(input > 0) positive.add(input); //양수
            else negative.add(Math.abs(input)); //음수 (절대값으로 저장)
        }

        int max = 0;
        // 양수/음수 큐가 비어 있는 경우, 가장 먼 책은 다른 큐의 첫 번째 값
        if(positive.isEmpty()) max = negative.peek();
        else if(negative.isEmpty()) max = positive.peek();
        // 둘 다 비어 있지 않다면, 두 큐의 가장 큰 값 중 더 큰 값을 max로 설정
        else max = Math.max(positive.peek(), negative.peek());

        int sum = 0;
        while(!positive.isEmpty()) {
            sum += positive.peek() * 2;
            for (int i = 0; i < M; i++) {
                positive.poll();
            }
        }
        while(!negative.isEmpty()) {
            //가장 먼 책 위치를 가져와 왕복 거리 더함
            sum += negative.peek() * 2;
            //한 번에 M권씩 처리하므로, M번 반복하여 책을 큐에서 제거
            for (int i = 0; i < M; i++) {
                negative.poll();
            }
        }
        //가장 먼 책의 경우, 0으로 돌아오지 않아도 되니 왕복하지 않도록 빼줌
        sum -= max;
        System.out.println(sum);
    }
}