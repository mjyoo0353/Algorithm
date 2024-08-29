class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        for(int i = 0; i < emergency.length; i++){ //환자를 하나씩 확인, i = 현재환자
            for(int j = 0; j < emergency.length; j++){ //현재 환자와 다른 환자를 비교, j = 다른환자
                if(emergency[i] < emergency[j]){ //다른환자 j의 응급도가 더 높다면
                    answer[i]++; //본인의 응급도를 +1 하여 응급순위에서 미루기
                }
            }
            //순서 배열의 모든 값에 +1 해줌 (0이 아닌 1부터 시작하도록)
            answer[i]++;
        }
        return answer;
    }
}
