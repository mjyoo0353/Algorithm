import java.util.*;

public class Main {
    public static void main(String[] agrs){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        
        for(int i = 1; i <= n; i++){
            list.add(sc.nextInt(), i);
        }
        for(int i = n - 1; i >= 0; i--){
            System.out.print(list.get(i) + " ");
        }
    }
}