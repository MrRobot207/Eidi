import java.util.Scanner;
public class While1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Bitte positive Zahlen eingeben und Eingabe mit 0 beenden: ");

        int n = scan.nextInt();

        while(n != 0){
            System.out.println("Gelesen: " + n);
            n = scan.nextInt();

        }

    }
}