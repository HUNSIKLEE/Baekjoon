class Solution {
    public int solution(double n) {
        int answer = 0;

                answer = (int) Math.sqrt(n);

                if(answer * answer == n){
                    answer = 1;
                } else{
                    answer = 2;
        }
        return answer;
    }
}