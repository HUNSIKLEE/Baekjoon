class Solution {
  public String solution(String my_string, String letter) {
        String answer = "";
        String[] a = my_string.split("");

        for(int i = 0; i < a.length; i++){

            if(a[i].equals(letter)){
                continue;
            }else {
                answer += a[i];
            }
        }
        return answer;
    }
}
