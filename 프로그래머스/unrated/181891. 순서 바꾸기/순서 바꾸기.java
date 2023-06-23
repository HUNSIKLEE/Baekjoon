class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int j = 0;
        if(n == 0) {
            return num_list;
        } else if (num_list.length == n) {
            return num_list;
        }
        for(int i = n; i < num_list.length; i++) {
            answer[j++] = num_list[i];
            if(i == num_list.length - 1) {
                i = -1;
            } else if(i == n - 1) {
                break;
            } else {
                if(num_list.length == n){
                    return num_list;
                }
            }
        }
        return answer;
    }
}