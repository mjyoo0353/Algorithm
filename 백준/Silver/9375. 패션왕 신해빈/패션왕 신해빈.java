import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        
        while(n-- > 0){
            Map<String, Integer> map = new HashMap<>();
            
            int num = Integer.parseInt(br.readLine());
            while(num-- > 0){
                String[] clothes = br.readLine().split(" ");
                map.put(clothes[1], map.getOrDefault(clothes[1], 0) + 1);
            }
            int answer = 1;
            for(String key : map.keySet()){
                //안 입는 경우를 고려하여 각 종류별 옷의 개수에 +1 해줘야 함
                answer *= map.get(key) + 1;
            }
            //알몸인 경우를 제외해주어야 하므로 최종값에 -1을 해줌
            System.out.println(answer - 1);
        }
    }
}