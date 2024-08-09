class Solution {
    public int solution(int a, int b) {
        int abNum = Integer.parseInt("" + a + b);
        int mul = 2 * a * b;

        if(abNum > mul){
            return abNum;
        }else if(abNum == mul){
            return abNum;
        }else{
            return mul;
        }
    }
}