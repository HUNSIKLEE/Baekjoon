class Solution {
    public int solution(int n) {
        int answer = 0;

        for(int i = 1; i <= n; i++){
            int k = 0;
            for (int j = 1; j <= i; j++){
                k += (i % j == 0) ? 1 : 0;
            }
            answer += (k >= 3) ? 1 : 0;
        }

        return answer;
    }
}