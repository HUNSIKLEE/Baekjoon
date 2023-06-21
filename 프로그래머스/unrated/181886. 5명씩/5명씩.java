class Solution {
    public String[] solution(String[] names) {
        int numberOfGroups = (int) Math.ceil(names.length / 5.0);
        String[] answer = new String[numberOfGroups];

        int j = 0;
        for (int i = 0; i < names.length; i++) {
            if (i % 5 == 0) {
                answer[j] = names[i];
                j++;
            }
        }

        return answer;
    }
}
