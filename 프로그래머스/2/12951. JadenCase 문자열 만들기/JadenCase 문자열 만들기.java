

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] a =  s.split(" ");

        // 공백을 기준으로 잘려진 문자열의 수만큼 반복
        for(int i = 0; i < a.length; i++){
            if(a[i].length() == 0) answer += " ";
            else{
                answer += a[i].substring(0, 1).toUpperCase();
                answer += a[i].substring(1, a[i].length()).toLowerCase(); 
                answer += " "; 
            }

        }

       
    if(s.substring(s.length() -1, s.length()).equals(" ")) return answer;
        return answer.substring(0, answer.length() - 1);
    }
}