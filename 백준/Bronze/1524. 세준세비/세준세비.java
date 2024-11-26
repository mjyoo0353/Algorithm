import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < T; i++){
            String L = br.readLine();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            
            int maxSejun = 0, maxSebi = 0;
            
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++) {
                int sejun = Integer.parseInt(st.nextToken());
                if(maxSejun < sejun) maxSejun = sejun;
            }
            
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++) {
                int sebi = Integer.parseInt(st.nextToken());
                if(maxSebi < sebi) maxSebi = sebi;
            }
            
            if(maxSejun > maxSebi) System.out.println("S");
            else if(maxSejun < maxSebi) System.out.println("B");
            else System.out.println("S");
        }
    }
}