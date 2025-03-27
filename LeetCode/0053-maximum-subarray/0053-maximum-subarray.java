class Solution {
    public int maxSubArray(int[] nums) {
        
        int maxSum = Integer.MIN_VALUE;
        int totalSum = 0;

        for(int i = 0; i < nums.length; i++){
            totalSum += nums[i];

            if(totalSum > maxSum){
                maxSum = totalSum;
            }

            if(totalSum < 0){
                totalSum = 0;
            }
        }
        return maxSum;
    }
}