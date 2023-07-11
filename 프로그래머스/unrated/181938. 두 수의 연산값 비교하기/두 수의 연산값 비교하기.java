class Solution {
    public int solution(int a, int b) {
        int answer = 0;

        String c = String.valueOf(a) + String.valueOf(b) ;
        String d = String.valueOf(2 * a * b);

        if (Integer.valueOf(c) > Integer.valueOf(d)) {
            return Integer.valueOf(c);
        } else {
            return Integer.valueOf(d);
        }
    }
}