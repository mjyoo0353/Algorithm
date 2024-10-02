import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        in.close();
        
        if(n1 > 0 && n2 > 0){
            System.out.println(1);
        }else if(n1 < 0 && n2 > 0){
            System.out.println(2);
        }else if(n1 < 0 && n2 < 0){
            System.out.println(3);
        }else{
            System.out.println(4);
        }
    }
}