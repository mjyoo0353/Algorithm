import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        int count = 0;
        for (int i = 0; i < n; i++) {
            //스카이라인의 고도가 바뀌는 지점의 좌표 x와 y
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            while (!stack.isEmpty() && stack.peek() > y) {
                count++;
                stack.pop();
            }
            if(!stack.isEmpty() && stack.peek() == y) continue;
            stack.push(y);
        }
        while(!stack.isEmpty()){
            if (stack.peek() > 0) count++;
            stack.pop();
        }
        System.out.println(count);
    }
}