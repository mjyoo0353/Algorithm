import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = new int[9];
        int max = Integer.MIN_VALUE;
        int index = 0;
        
        for(int i = 0; i < 9; i++){
            nums[i] = Integer.parseInt(br.readLine());
        }
        for(int i = 0; i < 9; i++){
            if(nums[i] > max){
                max = nums[i];
                index = i+1;
            }
        }
        System.out.println(max);
        System.out.println(index);
        br.close();
    }
}