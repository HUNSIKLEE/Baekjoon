import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        int b;

        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
//3을 입력받아 치고
        // i= 1,  1 <= 3

        // i= 2,  2 <= 3

        // i= 3,  3 <= 3
        for (int i = 1; i <= a; i++) {
            // j = 1, 1 <= 2

            // j = 1, 1 <= 2
            // j = 2, 2 <= 2

            // j = 1, 1 <= 3
            // j = 2, 2 <= 3
            // j = 3, 3 <= 3
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
