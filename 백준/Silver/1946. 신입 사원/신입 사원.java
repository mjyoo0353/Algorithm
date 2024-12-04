import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        while(T-- > 0){
            int N = Integer.parseInt(br.readLine());
            
            int[] arr = new int[N];
            for(int i = 0; i < N; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                int docRank = Integer.parseInt(st.nextToken());
                int interviewRank = Integer.parseInt(st.nextToken());
                arr[docRank-1] = interviewRank;
            }
            
            int count = 1;
            int rank = arr[0];
            for(int i = 1; i < N; i++){
                if(rank > arr[i]){
                    rank = arr[i];
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}