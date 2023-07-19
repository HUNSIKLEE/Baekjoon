import java.util.stream.Stream;

class Solution {
    public int solution(int num, int k) {
        int answer = -1; // Set the default answer to -1

        int[] a = Stream.of(String.valueOf(num).split("")).mapToInt(Integer::parseInt).toArray();
        String b = String.valueOf(k);

        for (int i = 0; i < a.length; i++) {
            if (b.equals(String.valueOf(a[i]))) { // Convert a[i] to a String
                answer = i + 1;
                break;
            }
        }

        return answer;
    }
}
