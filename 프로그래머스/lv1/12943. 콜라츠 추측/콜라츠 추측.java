class Solution {
    public int solution(int num) {
        int answer = 0;

        for (int i = 0; i < 500; i++) {

            if (num == 1) {
                return i;

            } else if (num % 2 == 0) {
                num = num / 2;
                continue;
            } else if (num % 2 == 1) {
                num = (num * 3) + 1;
                continue;
            } else {
                return  -1;
            }
        }

        return answer;
    }
}