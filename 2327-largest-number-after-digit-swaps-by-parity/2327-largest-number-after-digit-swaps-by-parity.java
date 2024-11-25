class Solution {
    public int largestInteger(int num) {
        
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        String strNum = String.valueOf(num);

        for(char s : strNum.toCharArray()){
            int n = Integer.parseInt(String.valueOf(s));
            if(n % 2 == 0){
                even.add(n);
            } else {
                odd.add(n);
            }
        }

        Collections.sort(even, Collections.reverseOrder());
        Collections.sort(odd, Collections.reverseOrder());

        String answer = "";
        int evenCnt = 0, oddCnt = 0;
        for(int i = 0; i < strNum.length(); i++){
            int n = Integer.parseInt(String.valueOf(strNum.charAt(i)));
            if(n % 2 == 0){
                answer += even.get(evenCnt);
                evenCnt++;
            }else {
                answer += odd.get(oddCnt);
                oddCnt++;
            }
        }
        return Integer.parseInt(answer);

    }
}