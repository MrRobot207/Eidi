import java . util . Scanner ;

public class ExerciseA {

    public static void main ( String [] args ) {

        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();

        switch (i) {
            case 2:
                System.out.println(1);
                break;
            case 4, 6, 8, 10:
                System.out.println(2);
                break;
            case 1, 3, 5, 7, 9, 11:
                System.out.println(3);
                break;
        }

    }
}

// Lösung: n = switch ( i ) {
//case 2 -> 1;
//case 0 , 1 , 3 , 4, 5 , 6 , 7 , 9 , 11 -> 2;
//default -> 3;
//}