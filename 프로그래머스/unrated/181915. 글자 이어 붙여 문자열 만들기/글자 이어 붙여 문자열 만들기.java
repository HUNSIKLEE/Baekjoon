
class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";

            String[] a = my_string.split("");
            String[] b =  new String[index_list.length];
            int j = 0;

            for(int i = 0; i < index_list.length; i++){
              b[j] =  a[index_list[i]];
              j++;
            }
        answer = String.join("", b);
        return answer;
    }
}