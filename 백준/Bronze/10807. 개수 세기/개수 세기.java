import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        String[] numbers = br.readLine().split(" ");
        int v = Integer.parseInt(br.readLine());
        int count = 0;
        br.close();
        
        for(int i = 0 ; i < N; i++){
            if(Integer.parseInt(numbers[i]) == v){
                count++;
            }
        }
        System.out.println(count);
        
    }
}