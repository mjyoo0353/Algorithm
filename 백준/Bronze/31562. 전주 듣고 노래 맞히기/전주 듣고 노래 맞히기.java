import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        
        Map<String, String> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            String[] arr = br.readLine().split(" ", 3);
            String key = arr[2].substring(0, 5);
            if(map.containsKey(key)){
                map.put(key, "?\n");
            } else {
                map.put(key, arr[1] + "\n");
            }
        }
        
        for(int i = 0; i < m; i++){
            sb.append(map.getOrDefault(br.readLine(), "!\n"));
        }
        System.out.println(sb);
    }
}