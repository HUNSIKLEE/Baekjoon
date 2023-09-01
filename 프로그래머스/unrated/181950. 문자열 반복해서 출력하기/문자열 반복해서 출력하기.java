import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        
        StringBuilder a = new StringBuilder();

      System.out.println( a.append(str.repeat(n)));
    }
}