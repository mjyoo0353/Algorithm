import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String input = br.readLine();
        char[] ch = input.toCharArray();
        
        int sum = 0;
        for(int i = 0; i < N; i++){
            int num = (ch[i] - 'a') + 1;
            sum += num * Math.pow(31, i);
        }
        System.out.println(sum);
    }
}