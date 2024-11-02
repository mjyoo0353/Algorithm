import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();
        String answer = "";
        
        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String key = st.nextToken();
            int cnt = Integer.parseInt(st.nextToken());
            map.put(key, map.getOrDefault(key, 0) + cnt);
        }
        
        if(map.containsValue(5)){
            answer = "YES";
        } else {
            answer=  "NO";
        }
        bw.write(answer);
        bw.flush();
        bw.close();
    }
}