import java.util.*;

/**
*ejercicio03
 */
public class ejercicio03 {

    public static Scanner Teclado = new Scanner (System.in);
     public static void main (String[] args){
         double s;
         int a, b, c, d;
         a=0;
         b=0;
         c=0;
         d=0;

         System.out.println ( "ingrese sueldo" );
         s = Teclado.nextDouble();

         while (s>0) {
             if (s<520) {
               a++;  
             } else {
                 if (s<780) {
                     b++;
                 } else {
                     if (s<999) {
                         c=c+1;
                     } else {
                         d=d+1;              
                     }
                         
                     }
                     
                 }
                 System.out.println ( "ingrese sueldo" );
         s = Teclado.nextDouble ();
             }

             System.out.println (a + " ganan menos de $520");
             System.out.println (b + " ganan entre $520 y $780");
             System.out.println (c + " ganan entre $780 y $999");
             System.out.println (d + " ganan mas de $999");


            }
        }




                                     


        

