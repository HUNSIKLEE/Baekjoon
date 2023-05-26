import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class Solution {
    public List solution(int[] num_list) {
        List<Integer> answer = new ArrayList<>();
        Arrays.sort(num_list);
        for(int i = 0; i < 5;i++){
            answer.add(num_list[i]);
        }
        return answer;
    }
}
