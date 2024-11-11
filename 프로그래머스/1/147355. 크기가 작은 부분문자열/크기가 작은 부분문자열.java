import java.util.*;

class Solution {
    public int solution(String t, String p) {
        int count = 0;
        
        for(int i = 0; i <= t.length() - p.length(); i++){
            Long temp = Long.parseLong(t.substring(i, p.length() + i));
            if (Long.parseLong(p) >= temp) {
                count++;
            }
        }
        return count;
    }
}