class Solution {
    public int solution(int n) {
       String answer = Integer.toString(n);
            int[] arrNum = new int[answer.length()];
            int b = 0;

            for (int i = 0; i < answer.length(); i++) {
                arrNum[i] = answer.charAt(i) - '0';
                    b += arrNum[i];
            }
            return b;
        }
    }