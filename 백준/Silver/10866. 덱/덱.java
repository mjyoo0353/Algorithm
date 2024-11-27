import java.io.*;;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
        덱을 구현하고, 입력으로 주어진 명령을 처리하는 문제
        1. 첫째 줄에는 명령의 수 N을 입력 받음
        2. 둘째 줄부터는 N개의 줄만큼 명령을 하나씩 입력받음
        3. 출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력함
        */
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> deque = new ArrayDeque<>();
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String input = st.nextToken();
            if(input.equals("push_front")){
                deque.addFirst(Integer.parseInt(st.nextToken()));
            }else if(input.equals("push_back")) {
                deque.addLast(Integer.parseInt(st.nextToken()));
            }else if(input.equals("pop_front")){
                if(!deque.isEmpty()) System.out.println(deque.pollFirst());
                else System.out.println(-1);
            }else if(input.equals("pop_back")) {
                if (!deque.isEmpty()) System.out.println(deque.pollLast());
                else System.out.println(-1);
            }else if(input.equals("size")){
                System.out.println(deque.size());
            }else if(input.equals("empty")){
                if(!deque.isEmpty()) System.out.println(0);
                else System.out.println(1);
            }else if(input.equals("front")){
                if(!deque.isEmpty()) System.out.println(deque.peekFirst());
                else System.out.println(-1);
            }else if(input.equals("back")){
                if(!deque.isEmpty()) System.out.println(deque.peekLast());
                else System.out.println(-1);
            }
        }
    }
}
