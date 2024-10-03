import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int num = N / 4;
        in.close();

        for(int i = 0; i < num; i++){
            System.out.print("long ");
        }
        System.out.println("int");
    }
}