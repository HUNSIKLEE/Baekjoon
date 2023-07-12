class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String[] str = new String[s.length()];
        int a = 0;
        int b = 0;

        for (int i = 0; i < s.length(); i++) {
            str[i] = Character.toString(s.charAt(i));
        }

        for (int i = 0; i < str.length; i++) {
            if (str[i].equalsIgnoreCase("p")) {
                a++;
            } else if (str[i].equalsIgnoreCase("y")) {
                b++;
            }
        }

        if (a != b) {
            answer = false;
        }

        return answer;
    }
}