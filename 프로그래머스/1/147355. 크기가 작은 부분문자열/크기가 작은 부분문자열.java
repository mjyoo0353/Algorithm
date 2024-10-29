import java.util.*;

class Solution {
    public int solution(String t, String p) {
        long tLength = t.length();
        int pLength = p.length();
        int answer = 0;

    
        for(int i = 0; i < tLength - pLength + 1; i++){
            long temp = Long.parseLong(t.substring(i, i + pLength));
            if(temp <= Long.parseLong(p)){
                answer++;
            }
        }
        return answer;
    }
}