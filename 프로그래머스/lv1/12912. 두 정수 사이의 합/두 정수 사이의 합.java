class Solution {
    public long solution(int a, int b) {
        long answer = 0;

        if(a > b){
            for(int i = a; b <= i; i--){
                answer += i;
            }
        } else if (a == b) {
            return a;
        }else {
            for (int i = a; i <= b; i++) {
                answer += i;
            }
        }


        return answer;
    }
}