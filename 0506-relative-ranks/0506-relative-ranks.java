class Solution {
    public String[] findRelativeRanks(int[] score) {
       
       PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
       for(int i = 0; i < score.length; i++){
        pq.add(score[i]);
       }
       
       String[] str = new String[pq.peek() + 1];
       for(int i = 1; i <= score.length; i++){
        if(i == 1){
            str[pq.poll()] = "Gold Medal";
        }else if(i == 2){
            str[pq.poll()] = "Silver Medal";
        }else if(i == 3){
            str[pq.poll()] = "Bronze Medal";
        }else {
            str[pq.poll()] = String.valueOf(i);
        }
       }

       String[] answer = new String[score.length];
       for(int i = 0; i < score.length; i++){
        answer[i] = str[score[i]];
       }
       return answer;
       
    }
}