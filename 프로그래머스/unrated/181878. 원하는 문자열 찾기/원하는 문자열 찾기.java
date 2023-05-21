
class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        String a = str1.toLowerCase();
        String b = str2.toLowerCase();

        if (a.contains(b)) {
            return 1;
        } else {
            return 0;
        }
    }

}