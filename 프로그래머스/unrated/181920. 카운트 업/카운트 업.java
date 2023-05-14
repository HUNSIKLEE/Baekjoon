class Solution {
    public int[] solution(int start, int end) {
        int[] answer = new int[end - start + 1];
        int j = 0;

        for(int i = 0; i <= end; i++){
            if(i >= start){
                answer[j] += i;
                j++;
            }

        }


        return answer;
    }
}