class Solution {
    public int solution(int[] num_list) {
        int mul = 1, sum = 0;
        
        for(int num : num_list){
            mul *= num;
            sum += num;
        }
        
        if(mul < (sum * sum)) return 1;
        else return 0;
    }
}