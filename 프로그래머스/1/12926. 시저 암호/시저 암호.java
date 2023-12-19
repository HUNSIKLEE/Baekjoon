class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        char[] upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        char[] lower = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        for (char ch : s.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                answer.append(getShiftedChar(ch, upper, n));
            }
            else if (Character.isLowerCase(ch)) {
                answer.append(getShiftedChar(ch, lower, n));
            } else {
                answer.append(" ");
            }
        }

        return answer.toString();
    }

    private char getShiftedChar(char ch, char[] charArr, int n) {
        int index = new String(charArr).indexOf(ch);
        if (index != -1) {
            int shiftedIndex = (index + n) % charArr.length;
            return charArr[shiftedIndex];
        }
        return ch;
    }
}
