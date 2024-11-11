import java.util.*;

class Solution {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int n = nums.length / 2;
        
        for(int num : nums){
            set.add(num);
        }
        return set.size() > n ? n : set.size();
        
    }
}