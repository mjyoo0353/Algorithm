import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();
        StringBuilder sb= new StringBuilder();
        List<Integer> list;
        
        while(n-- > 0){
            for(int i = 1; i <= 4; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                
                for(int j = 1; j <= 7; j++){
                    String name = st.nextToken();
                        
                    if(name.equals("-")){
                        continue;
                    }
                    
                    if(!map.containsKey(name)){
                        map.put(name, 0);
                    }
                    
                    int hrs;
                    if(i == 1 || i == 3) hrs = 4;
                    else if (i == 2) hrs = 6;
                    else hrs = 10;
                    map.put(name, map.get(name) + hrs);
                }
            }
        }
        
        if(map.size() == 0){
            sb.append("Yes");
        } else {
            list = new ArrayList<>(map.values());
            Collections.sort(list);
            
            if(list.get(list.size() - 1) - list.get(0) > 12){
                sb.append("No");
            } else {
                sb.append("Yes");
            }
        }
        System.out.println(sb);
    }
}