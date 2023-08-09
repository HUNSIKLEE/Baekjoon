import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> a = new ArrayList<Integer>();
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                a.add(arr[i]);
            }
        }
        if (a.size() < 1) {
            answer = new int[1];
            answer[0] = -1;
        } else {
            answer = new int[a.size()];
            for (int i = 0; i < answer.length; i++) {
                answer[i] = a.get(i);
            }
        }
        return answer;

    }
}