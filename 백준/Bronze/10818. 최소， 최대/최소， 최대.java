import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] numbers = new int[N];
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < N; i++){
            numbers[i] = in.nextInt();
        }
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int num : numbers){
            if(num < min){
                min = num;
            }
            if(num > max){
                max = num;
            }
        }
        sb.append(min).append(" ").append(max);
        System.out.println(sb);
        
    }
}