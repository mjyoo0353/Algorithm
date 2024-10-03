import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int X = in.nextInt();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < N; i++){
            int v = in.nextInt();
            if(v < X){
                sb.append(v).append(" ");
            }
        }
        System.out.println(sb);
    }
}