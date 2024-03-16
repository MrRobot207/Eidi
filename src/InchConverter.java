import java.util.Scanner;

public class InchConverter {
    static final int HALF_INCH_IN_TENTH_MM = 254 / 2;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int millim, tenthMillim;
        int inch, halfInch;

        System.out.print("Entfernung in mm: ");
        millim = scan.nextInt();
        tenthMillim = 10 * millim;

        inch = halfInch = tenthMillim / HALF_INCH_IN_TENTH_MM;
        tenthMillim -= halfInch * HALF_INCH_IN_TENTH_MM;

        inch /= 2;
        halfInch %= 2;

        if ( tenthMillim == 0 ) {
            System.out.print( millim + " mm sind exakt " + inch );
        } else {
            System.out.print( millim + " mm sind " + inch );
        }

        if ( halfInch > 0 ) {
            System.out.print( ".5" );
        }

        if ( tenthMillim == 0 ) {
            System.out.println( " Zoll." );
        } else {
            System.out.println( " Zoll mit einer Abweichung von " + tenthMillim + " Zehntelmillimeter.");
        }
    }
}
