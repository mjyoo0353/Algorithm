import java.util.*;

class Solution {
    public List<Integer> solution(int[] arr, int[] delete_list) {
        List<Integer> answer = new ArrayList<>();
        
        for(int num : arr){
            answer.add(num);
        }
        
        for(int num : delete_list){
            answer.remove(Integer.valueOf(num));
        }
        return answer;
    }
}