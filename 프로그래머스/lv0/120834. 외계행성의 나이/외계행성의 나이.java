class Solution {
	public String solution(int age) {
    	String answer = "";
        String a = "abcdefghij";
        String[] b = String.valueOf(age).split("");
        
        for (int i = 0; i < b.length; i++) {
        	answer += a.charAt(Integer.valueOf(b[i]));
		}
        return answer;
    }
}