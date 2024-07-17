class Solution {
    public String solution(String cipher, int code) {
        String[] x = cipher.split("");
        String answer = "";
        
        for(int i = code - 1; i < x.length; i += code){
            answer += x[i];
        }
        return answer;
    }
}