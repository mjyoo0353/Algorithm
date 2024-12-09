import java.util.*;
import java.io.*;

public class Main {
    static ArrayList<ArrayList<Integer>> graph;
    static int[] distanceArr;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 도시의 개수
        int M = Integer.parseInt(st.nextToken()); // 도로의 개수
        int K = Integer.parseInt(st.nextToken()); // 최소 거리
        int X = Integer.parseInt(st.nextToken()); // 출발 도시의 번호
        
        graph = new ArrayList<>();
        distanceArr = new int[N + 1];
        Arrays.fill(distanceArr, -1);
        
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            graph.get(A).add(B);
        }
        bfs(X);
        
        boolean answer = false;
        for (int i = 1; i <= N; i++) {
            if(distanceArr[i] == K){
                answer = true;
                System.out.println(i);
            }
        }
        if(!answer){
            System.out.println(-1);
        }
    }
    
    static void bfs(int start){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        distanceArr[start] = 0;
        
        while(!queue.isEmpty()){
            int curNode = queue.poll();
            for(int next : graph.get(curNode)){
                if(distanceArr[next] == -1){
                    distanceArr[next] = distanceArr[curNode] + 1;
                    queue.add(next);
                }
            }
        }
    }
}