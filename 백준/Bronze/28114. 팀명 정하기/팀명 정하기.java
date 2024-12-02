import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] num = new int[3];
        int[] year = new int[3];
        Map<Integer, String> map = new HashMap<>();
        
        for(int i = 0; i < 3; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            num[i] = Integer.parseInt(st.nextToken());
            year[i] = Integer.parseInt(st.nextToken()) % 100;
            String name = st.nextToken().substring(0, 1);
            map.put(num[i], name);
        }
        Arrays.sort(num);
        Arrays.sort(year);
        
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(int i = 0; i < 3; i++){
            sb1.append(year[i]);
        }
        for(int i = 2; i >= 0; i--){
            sb2.append(map.get(num[i]));
        }
        System.out.println(sb1 + "\n" + sb2);
        
    }
}