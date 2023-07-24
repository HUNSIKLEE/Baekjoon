class Solution {
    public int solution(String my_string) {
        int answer = 0;

        String[] a = my_string.split("");

        for (int i = 0; i < a.length; i++){
            answer += Integer.parseInt(a[i]);
        }
        return answer % 9;
    }
}