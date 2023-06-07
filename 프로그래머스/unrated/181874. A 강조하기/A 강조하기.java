import java.util.Arrays;
import java.util.Locale;

class Solution {
    public String solution(String myString) {
        String answer = "";
        if(myString.equals("[a-z")) {
             answer = myString.replaceAll("a", "A");
        }else {
          String a =  myString.toLowerCase(Locale.ROOT);
             answer = a.replaceAll("a", "A");
        }

        return answer;
    }
}