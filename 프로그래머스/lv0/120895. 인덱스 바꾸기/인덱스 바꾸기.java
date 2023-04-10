class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String temp = "";
        String[] b = my_string.split("");

        for (int i = 0; i < my_string.length(); i++) {

            if (i == num1) {
                temp = b[i];
                b[i] = b[num2];
                answer += b[i];
                continue;
            } else if (i == num2) {
                b[i] = temp;
                answer += b[i];
                continue;
            }

            answer += b[i];


        }

        return answer;
    }
}