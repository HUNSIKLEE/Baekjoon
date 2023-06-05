import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(String[] str_list, String ex) {

     
    String[] b = new String[str_list.length];

        for (int i = 0; i < str_list.length; i++) {
            b[i] = str_list[i];
            if (str_list[i].contains(ex)) {
                b[i] = "";
            }
        }
        String a = Arrays.stream(b).collect(Collectors.joining()); // 문자열 배열을 전달하고 Join
        return a;
    }

}