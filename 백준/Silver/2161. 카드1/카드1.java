import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        
        for(int i = 1; i <= n; i++){
            q.add(i);
        }
        
        while(q.size() > 1){
            sb.append(q.poll()).append(" ");
            q.add(q.peek());
            q.poll();
        }
        sb.append(q.poll());
        System.out.println(sb);
    }
}