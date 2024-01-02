import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> resultList = new ArrayList<>();

        for (int i = l; i < r + 1; i++) {
            String strNum = String.valueOf(i);
            if (strNum.chars().allMatch(ch -> ch == '0' || ch == '5')) {
                resultList.add(i);
            }
        }

        if (resultList.isEmpty()) {
            return new int[]{-1};
        }

        return resultList.stream().mapToInt(Integer::intValue).toArray();
    }
}
