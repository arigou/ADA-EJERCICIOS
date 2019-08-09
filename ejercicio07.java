import java.util.*;

/**
 * ejercicio07
 * 
 */

public class ejercicio07 {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {

        double hs, costo = 0;

        System.out.println("Ingrese las horas que estuvo el cliente:");
        hs = Teclado.nextDouble();

        if (hs < 2) {
            costo = hs * 5;
        } else {
            if (hs < 5) {
                costo = (5 * 2) + ((hs - 2) * 4);
            } else {
                if (hs < 10) {
                    costo = (5 * 2) + (3 * 4) + ((hs - 5) * 3);
                } else {
                    costo = (5 * 2) + (3 * 4) + (5 * 3) + ((hs - 10) * 2);
                }
            }
        }
        System.out.println("El costo a abonar por " + hs + " horas será $: " + costo);
    }

}