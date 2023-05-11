class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length - (n-1)];

        for(int i = 0, j = 0; i < num_list.length; i++) {
            if (i >= n - 1) {
                answer[j] += num_list[i];
                    j++;
            }
        }
        return answer;
    }
}