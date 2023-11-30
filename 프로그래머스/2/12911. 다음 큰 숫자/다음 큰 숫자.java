class Solution {
    public static int solution(int n) {
        int count = Integer.bitCount(n);

        return findNextBiggerNumber(count, n);
    }

    private static int findNextBiggerNumber(int count, int n) {
        while (true) {
            n++;
            int binaryCount = Integer.bitCount(n);

            if (binaryCount == count) {
                return n;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(solution(78));
        System.out.println(solution(15));
    }
}
