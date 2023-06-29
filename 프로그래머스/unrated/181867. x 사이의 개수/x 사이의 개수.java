class Solution {
    public int[] solution(String myString) {

        String[] b = myString.split("x", -1);

        int[] answer = new int[b.length];

        for (int i = 0; i < b.length; i++) {
            answer[i] = b[i].length();
        }
        return answer;
    }
}