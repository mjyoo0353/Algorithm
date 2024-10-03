import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < N; i++) {
            int v = Integer.parseInt(st.nextToken());
            if(v < X){
                sb.append(v).append(' ');
            }
        }
        System.out.println(sb);
    }
}