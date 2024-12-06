import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        
        // 완전 이진 트리는 2^k - 1로 이루어져있다.
        int[] tree = new int[(int) Math.pow(2, K) - 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < tree.length; i++){
            tree[i] = Integer.parseInt(st.nextToken());
        }
        
        StringBuilder sb = new StringBuilder();
        int length = tree.length;
        int parent = length;
        
        // 각 레벨의 노드를 추출 (루트부터 시작)
        while(parent != 0) {
            int child = parent / 2;  // 다음 레벨의 첫 노드
            int gap = (parent - child) * 2; // 현재 레벨의 노드 간 간격
            
            // 현재 레벨의 노드들 출력
            for(int i = child; i < length; i += gap){
                sb.append(tree[i]).append(" ");
            }
            parent = child; // 부모 노드를 현재의 자식 노드로 갱신
            sb.append("\n");
        }
        System.out.println(sb);
    }
}