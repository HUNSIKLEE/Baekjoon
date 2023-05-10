import java.util.Arrays;

class Solution {
    public int solution(String num_str) {
        int answer = 0;

        String[] a = new String[num_str.length()];

       a = num_str.split("");

        int[] nums = Arrays.asList(a).stream().mapToInt(Integer::parseInt).toArray();

        System.out.println(nums);
        for(int i = 0; i < num_str.length(); i++){

        answer += nums[i];

        }
        return answer;
    }
}