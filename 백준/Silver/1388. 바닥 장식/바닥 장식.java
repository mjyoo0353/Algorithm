import java.io.*;
import java.util.*;

public class Main {
    static char[][] room;
    static boolean[][] visited;
    static int N, M;
    static int count = 0;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); // 세로크기
        M = Integer.parseInt(st.nextToken()); // 가로크기
        
        room = new char[N][M];
        visited = new boolean[N][M];
        
        for(int i = 0; i < N; i++){
            String input = br.readLine();
            for(int j = 0; j < M; j++){
                room[i][j] = input.charAt(j);
            }
        }
        
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                if(visited[i][j]) continue; //이미 방문한 곳은 건너뜀
                if(room[i][j] == '-') dfs(i, j, true); //'-'라면 가로 방향 탐색
                else dfs(i, j, false); //'|'라면 세로 방향 탐색
                count++; // 새 나무 판자를 발견하면 카운트 증가
            }
        }
        System.out.println(count);
    }
    
    // DFS 함수 정의
    //boolean row는 탐색 방향을 나타냄, row == true (가로방향), row == false (세로방향)
    static void dfs(int x, int y, boolean row){
        visited[x][y] = true; //현재 위치 방문 처리
        if(row) { //가로 방향 탐색인 경우
            y++; //오른쪽으로 이동
            if(y < M && room[x][y] == '-'){ //이동한 칸이 M 범위를 벗어나지 않으면서, '-'라면
                dfs(x, y, true); //dfs 재귀함수 호출하여 계속 탐색
            }
        }else {
            x++;
            if(x < N && room[x][y] == '|'){
                dfs(x, y, false);
            }
        }
    }
    
}