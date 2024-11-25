class Solution {
    public String[] findRelativeRanks(int[] score) {
       
       PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

       for(int i = 0; i < score.length; i++){
        pq.add(score[i]);
       }

        Map<Integer, String> map = new HashMap<>();
       for(int i = 1; i <= score.length; i++){
        if(i == 1){
            map.put(pq.poll(), "Gold Medal");
        }else if(i == 2){
            map.put(pq.poll(), "Silver Medal");
        }else if(i == 3){
            map.put(pq.poll(), "Bronze Medal");
        }else {
            map.put(pq.poll(), String.valueOf(i));
        }
       }

        String[] answer = new String[score.length];
        for(int i = 0; i < score.length; i++){
            answer[i] = map.get(score[i]);
        }
        return answer;
       
       
    }
}