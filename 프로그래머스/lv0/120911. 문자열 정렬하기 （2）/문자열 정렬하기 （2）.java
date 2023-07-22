import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";


           String[] a = my_string.toLowerCase().split("");
           Arrays.sort(a);

           for (int i = 0; i < a.length; i++){
               answer += a[i];
           }


        return answer;
    }
}