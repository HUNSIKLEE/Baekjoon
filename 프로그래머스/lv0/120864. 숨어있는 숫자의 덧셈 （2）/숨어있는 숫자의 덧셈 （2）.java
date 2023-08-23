class Solution {
    public int solution(String my_string) {

        int answer = 0;
        String[] a = my_string.replaceAll("[A-Za-z]", " ").split(" ");

        for (int i = 0; i < a.length; i++) {
            if (a[i].equals("")) {
                continue;
            } else {
                answer += Integer.parseInt(a[i].trim());
            }

        }

        return answer;
    }
}