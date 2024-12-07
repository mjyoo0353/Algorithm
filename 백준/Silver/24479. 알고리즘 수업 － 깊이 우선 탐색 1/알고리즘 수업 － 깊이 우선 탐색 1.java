import java.util.*;
import java.io.*;

public class Main {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static int[] visited;
    static int count = 1;
    static int N,M,startNode;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); //정점의 수
        M = Integer.parseInt(st.nextToken()); //간선의 수
        startNode = Integer.parseInt(st.nextToken()); //시작 정점

        visited = new int[N+1];

        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }
        
        for (int j = 0; j < M; j++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken()); //정점 u
            int v = Integer.parseInt(st.nextToken()); //정점 v
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        // 각 정점의 인접 리스트를 오름차순으로 정렬
        for(int i = 1; i <= N; i++) {
            Collections.sort(graph.get(i));
        }

        dfs(startNode);
        
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < visited.length; i++) {
            sb.append(visited[i]).append("\n");
        }
        System.out.println(sb);
    }

    static void dfs(int node) {
        visited[node] = count;

        for (int i = 0; i < graph.get(node).size(); i++) {
            int newNode = graph.get(node).get(i);
            if(visited[newNode] == 0){
                count++;
                dfs(newNode);
            }
        }
    }
}