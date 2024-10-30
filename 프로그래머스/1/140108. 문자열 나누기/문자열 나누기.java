class Solution {
    public int solution(String s) {
        int answer = 0;
        int count = 0;
        char x = s.charAt(0);
        
        for(int i = 0; i < s.length(); i++){
            if(count == 0){
                x = s.charAt(i);
                answer++;
            }
            if(x == s.charAt(i)) count++;
            else count--;
        }
        return answer;
        
    }
}