import java.util.Arrays;

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;

        return Arrays.stream(num_list)
                .map(x -> Integer.toBinaryString(x).length() - 1)
                .sum();

    }
}