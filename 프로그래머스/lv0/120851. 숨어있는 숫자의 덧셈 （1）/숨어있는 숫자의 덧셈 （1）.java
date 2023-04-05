
public class Solution {
    public int solution(String my_string) {
        String digits = my_string.replaceAll("[^0-9]", "");
        if (digits.isEmpty()) {
            return 0; // handle the case where there are no digits in the input string
        }

        int sum = 0;
        for (int i = 0; i < digits.length(); i++) {
            int digit = digits.charAt(i) - '0';
            sum += digit;
        }

        return sum;
    }
}