import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Set<Integer> set = new HashSet<>();
        
        for (int i = 0; i < N; i++) {
            int A = Integer.parseInt(st.nextToken());
            set.add(A);
        }
        int answer = 0;
        for (int i = 1; ; i++) {
            if(!set.contains(i)) {
                answer = i;
                break;
            }
        }
        System.out.println(answer);
    }
}
