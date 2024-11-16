import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();

        for(int i = 0 ; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String key = st.nextToken();
            int value = Integer.parseInt(st.nextToken());
            map.put(key, map.getOrDefault(key, 0) + value);
        }
        if(map.containsValue(5)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
