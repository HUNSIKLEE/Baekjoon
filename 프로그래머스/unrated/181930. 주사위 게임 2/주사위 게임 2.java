class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;

            if(a != b && a != c && b != c){
                return answer = a + b + c;
            } else {
                int i = (a * a) + (b * b) + (c * c);
                if (a == b && a == c && b == c ) {
                    return answer = (a + b + c)  * i * ((a * a * a) + (b * b * b) + (c * c * c));
                }else {
                    return answer = (a + b + c) * i;
                }
            }
    }
}