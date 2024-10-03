import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int count = 1;
        in.close();
        
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N - count; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < count; j++){
                System.out.print("*");
            }
            count++;
            System.out.println();
        }
    }
}