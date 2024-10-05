import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[5];
        int sum = 0;
        
        for(int i = 0; i < nums.length; i++){
            nums[i] = in.nextInt();
        }
        for(int i = 0; i < nums.length; i++){
            sum += nums[i] * nums[i];
        }
        System.out.println(sum % 10);
    }
}