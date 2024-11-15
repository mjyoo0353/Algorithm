import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();
        StringTokenizer st = new StringTokenizer(input, " ");
        String[] arr = new String[st.countTokens()];
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = st.nextToken();
        }
        System.out.println(arr.length);
    }
}