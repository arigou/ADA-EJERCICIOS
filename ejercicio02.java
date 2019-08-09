import java.util.*;

/**
*ejercicio02

 */

 public class ejercicio02 {
 
    public static Scanner Teclado = new Scanner (System.in);

    public static void main (String[] args){

    int a, b;
    System.out.println ( "ingrese el primer numero" );
         a= Teclado.nextInt ();
         System.out.println ( "ingrese el segundo numero" );
         b= Teclado.nextInt ();

         if (a>b) {
            System.out.println ( "a es mayor que b" );
             
         } else { if (a<b) {
            System.out.println ( "a es menor que b" );
             
         } else { System.out.println ( "a es igual que b" );
             
         }
             
         }
        }
 }

 
