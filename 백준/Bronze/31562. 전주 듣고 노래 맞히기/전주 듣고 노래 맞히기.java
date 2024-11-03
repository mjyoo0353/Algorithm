import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
        Map<String, String> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        
        while(n-- > 0){
            String[] arr = br.readLine().split(" ", 3);
            String key = arr[2].substring(0, 5);
            
            map.put(key, map.containsKey(key) ? "?\n" : arr[1] + "\n");
        }
        
        while(m-- > 0){
            sb.append(map.getOrDefault(br.readLine(), "!\n"));
        }
        System.out.println(sb);
    }
}