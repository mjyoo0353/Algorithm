import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        int sum = 0;
        
        for(String i : input.split(" ")){
            int n = Integer.parseInt(i);
            sum += n * n;
        }
        System.out.println(sum % 10);
    }
}