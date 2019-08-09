import java.util.*;

/**
*ejercicio04

 */

 public class ejercicio04 {
 
    public static Scanner Teclado = new Scanner (System.in);

    public static void main (String[] args){
        int v, p, vm;

        vm=0;
        p=0; 
         
         for (int i=1; i<=15; i++) {
            System.out.println ( "ingrese un numero positivo" );
            v= Teclado.nextInt (); 
             if (v>vm) {
                 vm=v;
                 p=i;

                 
             } else {
                 
             }

            }
             System.out.println ( "el valor maximo es " + vm + " en la posicion nº " + p);

    
        }
        }