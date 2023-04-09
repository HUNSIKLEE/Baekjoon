import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {

        String a = my_string.replaceAll("[a-z]", "");

        String[] answer = a.split("");

        Arrays.sort(answer);

        int[] result = new int[answer.length];
        for (int i = 0; i < answer.length; i++) {
            result[i] = Integer.parseInt(answer[i]);
        }

        return result;
    }
}
