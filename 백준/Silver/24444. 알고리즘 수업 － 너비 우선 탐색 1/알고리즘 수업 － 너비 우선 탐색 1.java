import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static int[] visited;
    static int N,M, startNode;
    static int count = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); //정점의 수
        M = Integer.parseInt(st.nextToken()); //간선의 수
        startNode = Integer.parseInt(st.nextToken()); //시작 정점
        
        visited = new int[N + 1];
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken()); //정점 u
            int v = Integer.parseInt(st.nextToken()); //정점 v
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        for (int i = 1; i <= N; i++) {
            Collections.sort(graph.get(i));
        }
        bfs(startNode);
        
        StringBuilder sb = new StringBuilder();
        // 1번부터 N번까지 방문 순서 출력
        for (int i = 1; i <= N; i++) {
            sb.append(visited[i]).append("\n");
        }
        System.out.println(sb);
    }
    
    static void bfs(int node) {
        Queue<Integer> queue = new LinkedList<>();
        visited[node] = count;
        count++;
        queue.add(node);

        while(!queue.isEmpty()){
            node = queue.poll();

            for (int i = 0; i < graph.get(node).size(); i++) {
                int nextNode = graph.get(node).get(i);
                
                if (visited[nextNode] == 0) {
                    queue.add(nextNode);
                    visited[nextNode] = count++;
                }
            }
        }
    }
}