import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();
        
        for(int i = 0; i < n; i++) {
            String str = br.readLine();
            set.add(str);
            
            StringBuilder sb = new StringBuilder(str);
            String reverse = sb.reverse().toString();
            
            if(set.contains(reverse)){
                System.out.println(reverse.length() + " " + reverse.charAt(reverse.length() / 2));
                break;
            }
        }
    }
}