public class Solution {
    public int solution(int[] array, int height) {
        int answer = 0; // array must have length

        for (int i = 0; i < array.length; i++) {
            if (array[i] > height) {
                answer += 1;
            }
        }
        return answer;
    }
}