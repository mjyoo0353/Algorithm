import java.util.*;

class Solution {
    public int solution(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = nums.length / 2;
        int answer = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 0);
            }
            map.put(nums[i], map.get(nums[i]) + 1);
        }
        int typeNum = map.size();
        if(typeNum < max || typeNum == max){
            answer = typeNum;
        } else {
            answer = max;
        }
        return answer;
    }
}