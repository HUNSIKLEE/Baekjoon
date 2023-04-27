import java.util.Arrays;

class Solution {
    public String solution(String my_string, int n) {
        String answer = "";

            String[] b = my_string.split("");

        String[] a = new String[n];

        int j = 0;
            for(int i = 0; i < my_string.length(); i++) {
                if (my_string.length() - n <= i) {
                    a[j] = b[i];
                        j++;
                }
            }
        answer = String.join("",a);
        return answer;
    }
}