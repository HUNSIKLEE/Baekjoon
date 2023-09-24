
class Solution {
    public String[] solution(String my_str, int n) {
        int cnt = (my_str.length() + n - 1) / n;
        String[] answer = new String[cnt];
        int j = 0;

        for(int i =0; i< my_str.length(); i += n){
            answer[j] = my_str.substring(i, Math.min(i + n, my_str.length()));
            j++;
        }
        return answer;
    }
}