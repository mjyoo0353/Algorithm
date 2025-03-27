class Solution {
    public long pickGifts(int[] gifts, int k) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        long sum = 0;

        for(int i = 0; i < gifts.length; i++){
            pq.add(gifts[i]);
        }
        for(int i = 0; i < k; i++) {
            pq.add((int) Math.sqrt(pq.poll()));
        }
        while(!pq.isEmpty()){
            sum += pq.poll();
        }

        return sum;
    }
}