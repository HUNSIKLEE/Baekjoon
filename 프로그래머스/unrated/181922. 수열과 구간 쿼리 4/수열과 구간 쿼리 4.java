import java.util.Arrays;

public class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = Arrays.copyOf(arr, arr.length);

        for (int[] query : queries) {
            for (int i = 0; i < answer.length; i++) {
                if (i >= query[0] && i <= query[1]) {
                    if (i % query[2] == 0) {
                        answer[i]++;
                    }
                }
            }
        }

        return answer;
    }
}
