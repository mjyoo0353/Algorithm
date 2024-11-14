import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        int count = 0;
        int minMax = 0;
        
        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            
            if(num == 1){ 
                int studentNum = Integer.parseInt(st.nextToken());
                queue.add(studentNum); 

                if(queue.size() >= count) { 
                    if (queue.size() == count) {
                        if (minMax > studentNum) {
                            minMax = studentNum;
                        }
                    }else {
                        count = queue.size();
                        minMax = studentNum;
                    }
                }
            }else queue.poll();
        }
        System.out.println(count + " " + minMax);
    }
}