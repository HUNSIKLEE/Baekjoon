import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";

        char[] a = s.toCharArray();
        Arrays.sort(a);

        return answer = new StringBuilder(new String(a)).reverse().toString();
    }
}