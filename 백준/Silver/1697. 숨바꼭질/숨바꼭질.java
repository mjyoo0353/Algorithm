import java.util.*;
import java.io.*;

public class Main {
    static int[] visited = new int[100001];
    static int N, K;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); //수빈이가 있는 위치
        K = Integer.parseInt(st.nextToken()); //동생이 있는 위치
        
        //같은 위치일 경우 bfs탐색안하고 0 출력
        if (N == K) System.out.println(0);
        else bfs(N);
    }
    
    static void bfs(int start){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = 1;
        
        while(!queue.isEmpty()){
            int now = queue.poll();
            
            for(int i = 0; i < 3; i++){
                int nextNode;
                if(i == 0) nextNode = now - 1;
                else if(i == 1) nextNode = now + 1;
                else nextNode = now * 2;
                
                //nextNode가 K를 만나면 bfs함수 탈출
                if(nextNode == K){
                    System.out.println(visited[now]); //현재까지 걸린 시간 반환
                    return;
                }
                
                if(nextNode >= 0 && nextNode <= 100000 && visited[nextNode] == 0){
                    queue.add(nextNode);
                    visited[nextNode] = visited[now] + 1; //시간 증가
                }
            }
        }
    }
}