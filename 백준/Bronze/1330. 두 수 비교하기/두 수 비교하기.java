import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(in.nextLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        if(a > b) {
            System.out.println(">");
        }else if(a < b) {
            System.out.println("<");
        }else {
            System.out.println("==");
        }
    }
}