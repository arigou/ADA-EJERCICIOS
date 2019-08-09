import java.util.*;

/**
 * ejercicio10
 * 
 */
 
public class ejercicio10 {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int vocales = 0;
        int espacios = 0;
        int puntos = 0;
        char caracter;

        System.out.println("Ingrese una oración letra por letra");
        caracter = Teclado.nextLine().charAt(0);

        while (caracter != '.') {
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
                vocales = vocales + 1; // podria poner vocales ++ //
                break;
            case ' ':
                espacios = espacios + 1;
                break;
            /*
             * case '.': puntos = puntos+1; break;
             */ /* no se pone porq nunca se va ejecutar */
            }
            System.out.println("Ingrese una oración letra por letra");

            caracter = Teclado.nextLine().charAt(0);
        }
        puntos++;

        System.out.println("la oracion tiene " + vocales + " vocales");
        System.out.println("la oracion tiene " + espacios + " espacios");
        System.out.println("la oracion tiene " + puntos + " punto");

    }
}
