import java.util.Scanner;
public class Pattern {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n;

        System.out.print("N eingeben: ");
        n = scan.nextInt();

        for (int k = 0; k <= n; ++k) {

            for (int i = 0; i < n - k; ++i) {
                System.out.print("*");
            }

            System.out.println();

            for (int i = 0; i < n-k; ++i) {
                System.out.print(" ");
            }

            for ( int i = 0; i < k; ++i ) {
                System.out.print("*");
            }

            System.out.print("\n");



        }
    }
}