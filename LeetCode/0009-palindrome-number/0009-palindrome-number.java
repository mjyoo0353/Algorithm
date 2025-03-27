class Solution {
    public boolean isPalindrome(int x) {
        
        int temp = x;
        int reversed = 0;

        if(x < 0) {
            return false;
        }

        while(temp != 0) {
            int lastDigit = temp % 10;
            reversed = reversed * 10 + lastDigit;
            temp /= 10;
        }
        return (reversed == x);
    }
}