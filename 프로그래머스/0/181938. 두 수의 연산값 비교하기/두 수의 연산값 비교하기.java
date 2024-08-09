class Solution {
    public int solution(int a, int b) {
        String abStr = Integer.toString(a) + Integer.toString(b);
        int mul = 2 * a * b;
        int abNum = Integer.parseInt(abStr);
        
        if(abNum > mul){
            return abNum;
        }else if(abNum == mul){
            return abNum;
        }else{
            return mul;
        }
    }
}