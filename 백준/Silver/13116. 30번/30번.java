import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            
            int AParent = A;
            int BParent = B;
            
            while(AParent != BParent){
                if(AParent > BParent){
                    AParent /= 2;
                }else {
                    BParent /= 2;
                }
            }
            System.out.println(AParent * 10);
        }
    }
}