import java.util.Arrays;

class Solution {
    public int[] solution(int[] numList, int n) {
        int[] answer = new int[numList.length];
        double[] order = new double[numList.length];
        
        for (int i = 0; i < numList.length; i++) {
            order[i] = (numList[i] - n < 0) ? Math.abs(numList[i] - n) + 0.5 : numList[i] - n;
        }
        
        Arrays.sort(order); 
        
        for (int i = 0; i < numList.length; i++) {
            answer[i] = (order[i] % 1 != 0) ? n - (int)order[i] : (int)order[i] + n;
        }
        
        return answer;
    }
}
