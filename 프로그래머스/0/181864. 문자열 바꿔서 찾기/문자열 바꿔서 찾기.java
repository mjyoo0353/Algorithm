class Solution {
    public int solution(String myString, String pat) {
        StringBuilder answer = new StringBuilder();
        
        for(int i = 0; i < myString.length(); i++){
            if(myString.charAt(i) == 'A'){
                answer.append('B');
            }else{
                answer.append('A');
            }
        }
        
        if(answer.toString().contains(pat)){
            return 1;
        }else{
            return 0;
        }
    }
}