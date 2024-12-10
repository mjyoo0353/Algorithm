import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); //N개의 홀수
        int[] numArr = new int[N];
        Map<Integer, Integer> map = new HashMap<>();
        
        double sum = 0;
        for (int i = 0; i < N; i++) {
            numArr[i] = Integer.parseInt(br.readLine());
            sum += numArr[i];
        }
        Arrays.sort(numArr);
        
        //map에 빈도 수 저장
        for(int num : numArr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        //최빈 값 구하기
        int mode = 0;
        int max = Collections.max(map.values());
        List<Integer> list = new ArrayList<>();
        
        for (int n : map.keySet()) {
            if (map.get(n) == max) list.add(n);
        }
        list.sort(null);
        if (list.size() > 1) mode = list.get(1);
        else mode = list.get(0);
        
        System.out.println(Math.round(sum / N));
        System.out.println(numArr[(numArr.length -1) / 2]);
        System.out.println(mode);
        System.out.println(numArr[numArr.length - 1] - numArr[0]);
    }
}