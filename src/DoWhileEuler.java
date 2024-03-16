import java.util.Scanner;
public class DoWhileEuler {

     public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Gib n ein: ");
    int n = scan.nextInt();

         int u = 1;
         int v = 0;
         int i = 0;
         int w = 0;


         System.out.println( "u = " + u + "   v = " + v + "   w = " + w + "   i = " + i );


         if ( n > 0 ) {
             do{
                 i++;
                 if(u == 1 && v == 1){
                     w = 2 * i/3;
                 }
                 else{
                     w = 1;
                 }
                 u = v;
                 v = w;
                 System.out.println( "u = " + u + "   v = " + v + "   w = " + w + "   i = " + i );
             } while(i < n);
         }
         System.out.println( "Ausgabe a_n = " + u );
}
}