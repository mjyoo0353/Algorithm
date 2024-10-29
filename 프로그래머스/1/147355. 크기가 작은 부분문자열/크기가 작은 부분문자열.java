import java.util.*;

class Solution {
    public int solution(String t, String p) {
        int tLength = t.length();
        int pLength = p.length();
        int answer = 0;
        
        for(int i = 0; i <= tLength - pLength; i++){
            long temp = Long.parseLong(t.substring(i, pLength + i));
            if(temp <= Long.parseLong(p)){
                answer++;
            }
        }
        return answer;
    }
}