import java.util.*;

/* dados 10 numeros que representan edades , calcular el promedio, 
imprimilo y luego imprimir todas las edades ingresadas*/

/**
 * ejercicio11
 */
public class ejercicio11 {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int[] edades = new int[10]; /* guarda espacio de memoria para 10 lugares */

        for (int i = 0; i < 10; i++) {
            System.out.println("ingrese el numero " + i);

            int numero;
            numero = Teclado.nextInt();
            edades[i] = numero;
        }
        int suma = 0;
        int prom = 0;
        for (int i = 0; i < 10; i++) {
            suma += edades[i]; /* suma = suma edades[i]; */
        }
        prom = suma / 10;

        System.out.println("el promedio es " + prom);

        for (int i = 0; i < 10; i++) {
            System.out.println("edaddes recibidas " + edades[i]);

        }
    }
}
