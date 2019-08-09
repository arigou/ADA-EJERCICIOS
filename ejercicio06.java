import java.util.*;

/**
*ejercicio06

 */

 public class ejercicio06 {
 
    public static Scanner Teclado = new Scanner (System.in);

    public static void main (String[] args){
        double peso, costo;
        int z;
        peso=0; costo=0; 

        System.out.println ( "ZONA 1: America del norte" );
        System.out.println ( "ZONA 2: America central" );
        System.out.println ( "ZONA 3: America del sur" );
        System.out.println ( "ZONA 4: Europa" );
        System.out.println ( "ZONA 5: Asia" );

        System.out.println ( "Ingrese N° ZONA a la que viaja el paquete:" );
        z = Teclado.nextInt ();
        if (z>5 || z<1) {
            System.out.println ( "No tenemos transporte para la zona mencionada" );
            
        } else {
            
        System.out.println ( "Ingrese gramos que pesa el paquete:" );
        peso = Teclado.nextDouble();

        if (peso > 5000) {
            System.out.println ( "El paquete no puede ser transportado porque excede el peso permitido" );
            
        } else {
            switch (z) {
                case 1:
                    costo=peso*11;
                    break;
                    case 2:
                    costo=peso*10;
                    break;
                    case 3:
                    costo=peso*12;
                    break;
                    case 4:
                    costo=peso*24;
                    break;
                    case 5:
                    costo=peso*27;
                    break;
         
            }
            System.out.println ( "El transporte del paquete dirigido a Zona: " + z + " costará $"+ costo );  
        }

        }
    }




    }