import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();
        
        for(int i = 0; i < N; i++){
            set.add(br.readLine());    
        }
        
        List<String> list = new ArrayList<>(set);
        Collections.sort(list, (a, b) -> {
            if(a.length() != b.length()){
                return a.length() - b.length();
            }
            return a.compareTo(b);
        });
        
        StringBuilder sb = new StringBuilder();
        for(String l : list){
            sb.append(l).append("\n");
        }
        System.out.println(sb);
    }
}