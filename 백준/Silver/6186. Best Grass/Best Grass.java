import java.util.*;
import java.io.*;

public class Main {
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        
        int[][] grid = new int[x][y];
        visited = new boolean[x][y];
        
        for(int i = 0; i < x; i++){
            String input = br.readLine();
            for(int j = 0; j < y; j++){
                char ch = input.charAt(j);
                grid[i][j] = ch == '#' ? 1 : 0;
            }
        }
        
        int count = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if(grid[i][j] == 1 && !visited[i][j]){
                    count++;
                    dfs(i, j, grid);
                }
            }
        }
        System.out.println(count);
    }
    
    static void dfs(int x, int y, int[][] grid){
        visited[x][y] = true;
        //상
        if(x - 1 >= 0 && grid[x - 1][y] == 1 && !visited[x - 1][y]){
            dfs(x - 1, y, grid);
        }
        //하
        if(x + 1 < grid.length && grid[x + 1][y] == 1 & !visited[x + 1][y]){
            dfs(x + 1, y, grid);
        }
        //좌
        if(y - 1 >= 0 && grid[x][y - 1] == 1 && !visited[x][y - 1]){
            dfs(x, y - 1, grid);
        }
        //우
        if(y + 1 < grid[0].length && grid[x][y + 1] == 1 && !visited[x][y + 1]){
            dfs(x, y + 1, grid);
        }
    }
}