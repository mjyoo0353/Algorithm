class Solution {
    public int largestInteger(int num) {
        
        PriorityQueue<Integer> even = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> odd = new PriorityQueue<>(Collections.reverseOrder());

        String strNum = "" + num;

        for(char s : strNum.toCharArray()){
            int n = Integer.parseInt(String.valueOf(s));
            if(n % 2 == 0){
                even.add(n);
            } else {
                odd.add(n);
            }
        }

        String answer = "";
        for(int i = 0; i < strNum.length(); i++){
            int n = Integer.parseInt(String.valueOf(strNum.charAt(i)));
            if(n % 2 == 0){
                answer += even.poll();
            }else {
                answer += odd.poll();
            }
        }
        return Integer.parseInt(answer);

    }
}