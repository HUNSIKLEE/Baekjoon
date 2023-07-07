import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5}, new int[][]{{1, 3}, {0, 4}})));
    }

    public static int[] solution(int[] arr, int[][] intervals) {
        int length = Arrays.stream(intervals)
                .mapToInt(group -> group[1] - group[0] + 1)
                .sum();

        int[] answer = new int[length];
        int index = 0;
        for (int[] group : intervals) {
            for (int j = group[0]; j <= group[1]; j++) {
                answer[index++] = arr[j];
            }
        }
        return answer;
    }
}
