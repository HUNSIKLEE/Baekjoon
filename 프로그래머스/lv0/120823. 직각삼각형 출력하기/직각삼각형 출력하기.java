import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
//        int n = 3;
        for(int i = 1; i <= n; i++){
            if(i != 1)
            System.out.println("");
            for(int j = 0; j < i; j++){
                System.out.print('*');
            }
        }
    }
}