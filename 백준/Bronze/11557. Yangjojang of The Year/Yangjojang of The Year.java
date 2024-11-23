import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < T; i++){
            int N = Integer.parseInt(br.readLine());
            for(int j = 0; j < N; j++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                map.put(st.nextToken(), Integer.parseInt(st.nextToken()));
            }
            for(String key : map.keySet()){
                if(map.get(key) == Collections.max(map.values())){
                    System.out.println(key);
                }
            }
        }
    }
}