class Solution {
    public int solution(int[] sides) {
        int a = Math.max(sides[0], sides[1]);
        int b = Math.min(sides[0], sides[1]);

        int c = a - b;
        int d = a + b;

        return d - c - 1;
    }
}