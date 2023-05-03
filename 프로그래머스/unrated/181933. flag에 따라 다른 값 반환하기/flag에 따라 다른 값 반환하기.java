class Solution {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;

        if (flag == true) {
            if (b > a) {
                answer = b + a;
            } else {
                answer = a + b;
            }
        }
            if (flag == false) {
                if (b > a) {
                    answer = (a) - b;
                } else {
                    answer = a - b;
                }
            }

        return answer;
    }
}