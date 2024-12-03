import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        //대기중인 학생수가 최대가 된 순간의 최대 학생 수 찾기
        //최대 학생 수가 여러번일 경우, 그 중에서 맨 뒤에 대기 중인 학생의 최소 번호값 찾기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // n번 반복
        Queue<Integer> queue = new ArrayDeque<>();

        //1 a: 맨 뒤에 줄서기, a는 학생 번호
        //2: 맨 앞에서 대기 중인 학생 1명이 식사 시작
        int maxCount = 0;
        int minNum = 0;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());

            if(num == 1){ //맨 뒤에 줄서기
                int studentNum = Integer.parseInt(st.nextToken());
                queue.add(studentNum);

                if(queue.size() > maxCount){
                    maxCount = queue.size();
                    minNum = studentNum;
                }else if(queue.size() == maxCount) {
                    if (minNum > studentNum) minNum = studentNum;
                }
            }else queue.poll(); //식사 시작
        }
        System.out.println(maxCount + " " + minNum);
    }
}