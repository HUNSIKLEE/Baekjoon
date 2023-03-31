class Solution {
    public int solution(int num1, int num2) {
        int answer = num1%num2;
        if(num1 % num2 == 0){
            return 0;
        }else if(num1 % num2 == 1){
            return 1;
        }
        return answer;
    }
}