
/*/ devolver la suma de lementos de un array el
num 13 es de mala suerte asi q no debe sumarse
ignorar tb el num siguiente al 13*/

import java.util.*;

/**
 * ejercicio14
 * 
 */

public class ejercicio14 {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int n;
        System.out.println("ingrese la cantidad de numeros");
        n = Teclado.nextInt();
        int[] numeros = new int[n];

        boolean hay13 = false;

        int suma = 0;

        for (int i = 0; i < n; i++) {

            System.out.println("ingrese el numero  ");
            numeros[i] = Teclado.nextInt();

            if (numeros[i] == 13) {
                hay13 = true;

            } else {
                if (!hay13) {
                    suma = suma + numeros[i];
                } else {
                    hay13 = false;
                }
            }

        }
        System.out.println("la suma de los elementos es  " + suma);
    }

}
