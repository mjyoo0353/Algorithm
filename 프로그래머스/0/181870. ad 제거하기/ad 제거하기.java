import java.util.*;

class Solution {
    public List<String> solution(String[] strArr) {
        List<String> answer = new ArrayList<>();
        
        for(String str : strArr){
            if(!str.contains("ad")){
                answer.add(str);
            }
        }
        return answer;
    }
}