import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        int[] sortedArr = new int[N];
        
        for (int i = 0; i < N; i++) {
            int input = Integer.parseInt(st.nextToken());
            arr[i] = input;
            sortedArr[i] = input;
        }
        Arrays.sort(sortedArr);
        
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < N; i++) {
            if(!map.containsKey(sortedArr[i])){
                map.put(sortedArr[i], count++);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++) {
            sb.append(map.get(arr[i])).append(" ");
        }
        System.out.println(sb);
    }
}