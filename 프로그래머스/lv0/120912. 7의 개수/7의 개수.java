import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;

       String a = Arrays.toString(array).replaceAll("[^0-9]","");

       String[] b = a.split("");

       for (int i = 0; i < b.length; i++){
           if(b[i].equals("7")){
               answer += 1;
           }
       }

        return answer;
    }
}