class Solution {
    public int[] solution(int start, int end) {
        int[] answer = new int[start - end + 1];
        int j = 0;

        for (int i = start; i >= end; i--) {

            if (i >= end && i <= start) {
                answer[j] += i;
                j++;
            }

        }

        return answer;
    }
}