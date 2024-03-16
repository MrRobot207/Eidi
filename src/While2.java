import java.util.Scanner;
public class While2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bitte Zahlen eingeben und Eingabe mit 0 beenden: ");

        int n = scan.nextInt();

        while (n != 0) {

            for (int i = 0; i < n; ++i) {

                System.out.print("*");
            }
            System.out.println();
            n = scan.nextInt();
        }
    }
}