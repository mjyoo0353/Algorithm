import java.util.*;
import java.io.*;

public class Main {
    static int[][] map;
    static boolean[] visited;
    static int n, m;
    static int answer = -1;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine()); //전체 사람의 수
        
        // 촌수를 계산해야 하는 두 사람의 번호 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken()); //시작 노드
        int end = Integer.parseInt(st.nextToken()); //목표 노드
        
        // 인접 행렬 및 방문 배열 초기화
        map = new int[n+1][n+1];
        visited = new boolean[n+1];
        
        m = Integer.parseInt(br.readLine()); //부모 자식들 간의 관계의 개수
        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int parent = Integer.parseInt(st.nextToken()); //부모 번호
            int child = Integer.parseInt(st.nextToken()); //자식 번호
            //무방향 그래프이기 때문에 촌수 계산을 위해 양방향 간선으로 설정이 필요함
            //관계가 있으면 1로, 없으면 기본값인 0으로 값이 들어감
            map[parent][child] = map[child][parent] = 1;
        }
        dfs(start, end, 0);
        System.out.println(answer);
    }
    
    static void dfs(int start, int end, int count){
        visited[start] = true; //현재 노드 방문처리
        if(start == end){ //현재 노드가 목표 노드에 도달하면
            answer = count; //촌수 저장
            return; //탐색 종료
        }
        
        //1번부터 n번까지의 노드를 탐색
        for(int i = 1; i <= n; i++){
            //탐색하는 위치가 부모-자식 관계이고, 방문했던 적이 없다면
            if(map[start][i] == 1 && !visited[i]){
                // 다음 노드로 이동하며 촌수 증가
                dfs(i, end, count+1);
            }
        }
    }
}