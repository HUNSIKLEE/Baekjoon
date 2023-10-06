import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        BigInteger ab = new BigInteger(a);
        BigInteger bc = new BigInteger(b);
        BigInteger sum =  ab.add(bc);
        return sum.toString();
    }
}