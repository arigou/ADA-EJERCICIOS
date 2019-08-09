
/* Dados dos arrays de numeros enteros , de 7 posiciones, generar un tercer array con 7 elementos, 
donde cada elemento sea la suma de los dos arrays anteriores */

import java.util.*;

/**
 * ejercicio12
 */
public class ejercicio12 {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int[] numerosenterosa = new int[7];
        int[] numerosenterosb = new int[7];
        int[] sumaab = new int[7];


        for (int i = 0; i < 7; i++) {
            System.out.println("ingrese el numero A en posición " + i);

            /*int numeroa;
            numeroa = Teclado.nextInt();
            numerosenterosa[i] = numeroa;*/
            numerosenterosa[i] = Teclado.nextInt();

            System.out.println("ingrese el numero B en posición " + i);

            /*int numerob;
            numerob = Teclado.nextInt();
            numerosenterosb[i] = numerob;*/
            numerosenterosb[i]= Teclado.nextInt();

            /*int sumaab = 0;*/
            sumaab[i] = numerosenterosa[i] + numerosenterosb[i];

            System.out.println("la suma de A y B en posición " + i + " es: " + sumaab[i]);
            System.out.println(" ");
            System.out.println(" ");

        }

    
    }
}