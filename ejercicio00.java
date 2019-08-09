import java.util.*;

/**
*ejercicio00
 */
 public class ejercicio00 {
     public static Scanner Teclado = new Scanner (System.in);
     public static void main (String[] args){
         int a, b, c;
         System.out.println ( "ingrese el primer numero" );
         a= Teclado.nextInt ();
         System.out.println ( "ingrese el segundo numero" );
         b= Teclado.nextInt ();

         c=(a*b);

         System.out.println ("el resultado es:" + c);
         
     }
 }