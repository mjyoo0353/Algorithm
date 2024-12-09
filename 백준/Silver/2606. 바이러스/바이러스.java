import java.util.*;
import java.io.*;

public class Main {
    static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    static boolean[] visited;
    static int count = 0;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); //컴퓨터의 수
        int M = Integer.parseInt(br.readLine()); //연결되어 있는 컴퓨터 쌍의 수
        
        visited = new boolean[N + 1];
        
        for(int i = 0; i <= N; i++){
            list.add(new ArrayList<>());
        }
        for(int i = 0; i < M; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken()); //컴퓨터 번호
            int y = Integer.parseInt(st.nextToken()); //컴퓨터 번호
            list.get(x).add(y);
            list.get(y).add(x);
        }
        
        //1번 컴퓨터를 통해 웜 바이러스에 걸리게 되는 컴퓨터의 수를 출력
        dfs(1);
        System.out.println(count);
    }
    
    static void dfs(int start){
        visited[start] = true;
        
        for(int i : list.get(start)){
            if(!visited[i]){
                count++;
                dfs(i);
            }
        }
    }
}