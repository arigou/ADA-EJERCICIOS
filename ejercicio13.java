
/* INGRESAR ORACIONES ENTERAS Y DESPUES CONVERTIRLAS A CHAR */
import java.util.*;

/**
 * ejercicio13
 * 
 */

public class ejercicio13 {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int vocales = 0;
        int espacios = 0;
        String oracion;
        char[] letras;

        System.out.println("Ingrese una oración ");
        oracion = Teclado.nextLine();
        letras = oracion.toCharArray();

        for (int i = 0; i < letras.length; i++) { // *letras.length es una propiedad - largo de la oracion*/
            if (esvocal(letras[i])) {
                vocales++;
            } else if (letras[i] == ' ') {
                espacios++;
            }
        }
        
        System.out.println("la oracion tiene " + vocales + " vocales");
        System.out.println("la oracion tiene " + espacios + " espacios");
        System.out.println("la oracion tiene " + 1 + " punto");

    }

    static boolean esvocal(char caracter) {
        switch (caracter) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
        case 'A':
        case 'E':
        case 'I':
        case 'O':
        case 'U':
            return true;

        }
        return false;

    }
}