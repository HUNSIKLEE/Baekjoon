class Solution {
    public Long solution(int[] num_list) {
        Long answer = 0L;
        Long a = 1L;

        for(int i = 0; i < num_list.length; i++){
            if(num_list.length >  10) {
                answer += num_list[i];
            }else {
                a*= num_list[i];
                answer = a;
            }
        }
        return answer;
    }
}