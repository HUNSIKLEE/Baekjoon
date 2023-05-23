class Solution {
    public int solution(int n, String control) {
        int answer = n;

        String[] con = control.split("");

        for(int i = 0; i < con.length; i++){

            if(con[i].equals("w")){
                answer += 1;
            }
           else if(con[i].equals("s")){
                answer -= 1;
            }
            else if(con[i].equals("d")){
                answer += 10;
            }
            else if(con[i].equals("a")){
                answer -= 10;
            }

        }

        return answer;
    }
}