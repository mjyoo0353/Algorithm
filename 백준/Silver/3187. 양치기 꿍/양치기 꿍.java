import java.util.*;
import java.io.*;

public class Main {
    static char[][] map;
    static boolean[][] visited;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};
    static int r, c;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        map = new char[r][c];
        visited = new boolean[r][c];

        for (int i = 0; i < r; i++) {
            map[i] = br.readLine().toCharArray();
        }

        int totalSheep = 0, totalWolf = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if((map[i][j] == 'k' || map[i][j] == 'v') && !visited[i][j]){
                    int[] result = dfs(i, j);
                    if(result[0] > result[1]) totalSheep += result[0];
                    else totalWolf += result[1];
                }
            }
        }
        System.out.println(totalSheep + " " + totalWolf);
    }

    static int[] dfs(int x, int y){
        visited[x][y] = true;
        int sheepCount = 0;
        int wolfCount = 0;

        if(map[x][y] == 'k') sheepCount++;
        else if(map[x][y] == 'v') wolfCount++;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            
            if(nx >= 0 && ny >= 0 && nx < r && ny < c && !visited[nx][ny] && map[nx][ny] != '#'){
                int[] result = dfs(nx, ny);
                sheepCount += result[0];
                wolfCount += result[1];
            }
        }
        return new int[]{sheepCount, wolfCount};
    }
}
