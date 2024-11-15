import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine(), " ");
        String b = sc.nextLine();
        int count = 0;
        
        while(st.hasMoreTokens()) {
            String a = st.nextToken();
            if(!a.equals(b) && a.startsWith(b)){
                count++;
            }
        }
        System.out.println(count);
    }
}