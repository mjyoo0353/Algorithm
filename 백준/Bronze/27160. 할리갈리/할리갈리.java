import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();
        String answer = "";
        
        for(int i = 0; i < n; i++){
            String[] input = br.readLine().split(" ");
            int cnt = Integer.parseInt(input[1]);
            map.put(input[0], map.getOrDefault(input[0], 0) + cnt);
        }
        
        if(map.containsValue(5)){
            answer = "YES";
        } else {
            answer=  "NO";
        }
        System.out.println(answer);
    }
}