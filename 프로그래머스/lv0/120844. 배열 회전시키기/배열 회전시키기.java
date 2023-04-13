class Solution {
    public int[] solution(int[] numbers, String direction) {
      int[] answer = new int[numbers.length];
        int temp;
        
        if (direction.equals("right")) {
            temp = numbers[numbers.length-1];
            
            for (int i =0; i < numbers.length - 1; i++) {
                answer[i+1] = numbers[i];
            }
            answer[0] = temp;
        } else {
            temp = numbers[0];
            
            for (int i =0; i < numbers.length - 1; i++) {
                answer[i] = numbers[i + 1];
            }
            answer[answer.length-1] = temp;
            
        }
        return answer;
    }
}