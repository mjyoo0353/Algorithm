import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
    
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int count = 0;
        
        for(int i = 0; i < scoville.length; i++){
            pq.offer(scoville[i]);
        }
        while(pq.peek() < K){
            if(pq.size() == 1){
                return -1;
            }
            pq.offer(pq.poll() + (pq.poll() * 2));
            count++;
        }
        return count;
    }
}