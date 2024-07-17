class Solution {
    public String solution(String my_string, int n) {
        String[] arr = my_string.split("");
        String answer = "";
        
        for(int i = 0; i < arr.length; i++){
            answer += arr[i].repeat(n);
        }
        
        return answer;
    }
}