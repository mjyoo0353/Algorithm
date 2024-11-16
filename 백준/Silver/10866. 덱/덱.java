import java.io.*;;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Deque<Integer> deque = new ArrayDeque<>();

        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(sc.nextLine(), " ");
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
