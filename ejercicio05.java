import java.util.*;

/**
*ejercicio05

 */

 public class ejercicio05 {
 
    public static Scanner Teclado = new Scanner (System.in);

    public static void main (String[] args){
      double v, t1, t2, t3, tt;
      int a, b, c, cn, n; 
      a=0; b=0; c=0; t1=0; t2=0; t3=0; tt=0; cn=1; 
      
      System.out.println ( "ingrese cantidad de ventas" );
         n = Teclado.nextInt ();
         for (int i=1; i<=n; i++){

         if (cn<=n) {
            System.out.println ( "ingrese el monto de la venta" );
         v = Teclado.nextDouble();  

         if (v>1000) {
            a=a+1;
            t1=t1+v;    
            tt=tt+v;
               cn=cn+1;        
         } else {
            if (v>500) {
               b=b+1;
               t2=t2+v;
               tt=tt+v;
               cn=cn+1;
               
            } else {
               c=c+1;
               t3=t3+v;

               tt=tt+v;
               cn=cn+1;
               
            }
            
         }

         } else {         } 

    }
            System.out.println ( "Las ventas mayores a $1000 fueron " +a + " y sumaron $ " +t1 );
            System.out.println ( "Las ventas entre $500 y $1000 fueron " + b + " y sumaron $ " +t2 );
            System.out.println ( "Las ventas menores a $500 fueron " +c + " y sumaron $ " +t3 );
            System.out.println ( "La venta total fue de $ " + tt );
   }
   }