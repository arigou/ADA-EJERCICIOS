import java.util.*;

/**
 * ejercicio08
 * 
 */

public class ejercicio08 {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {
       int c;
       
        System.out.println("Ingrese calificación numérica obtenida");
        c = Teclado.nextInt();
        
        if ( c<=10) {
            switch (c) {
                case 10:
                   System.out.println("La calificacion es A");
                    case 9:
                    System.out.println("La calificacion es B");
                    case 8:
                    System.out.println("La calificacion es c");
                    case 7:
                    case 6:
                    System.out.println("La calificacion es D");
                    case 5:
                    case 4:
                    case 3:
                    case 2:
                    case 1:
                    case 0:
                    System.out.println("La calificacion es F");
        }} else  {
            System.out.println("La nota ingresada no es válida");
            
        }
    }



    }