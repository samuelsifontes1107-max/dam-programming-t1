package ejercicios;

import java.util.Scanner;

public class ejercicio14 {
    static void main(String[] args) {


                //Una persona que trabaja en una frutería necesita calcular los beneficios anuales que obtiene

                //de la venta de manzanas y peras.

                //Por este motivo, es necesario diseñar una aplicación que solicite las ventas (en kilos)

                //de cada semestre para cada fruta.

                //La aplicación mostrará el importe total sabiendo que el precio del kilo de manzanas está fijado

                //en 2.35€ y el de peras en 1.95€

                //Nota: Utiliza el operador suma y asigna

                //en algún momento del ejercicio.


                double ventaManzanas;

                double ventasPeras;

                double beneficiosAnuales;


                Scanner sc = new Scanner(System.in);


                System.out.println("ingrese ventas de manzanas semestre 1 ");

                ventaManzanas = sc.nextDouble();


                System.out.println("ingrese ventas de peras semestre 1 ");
                ventasPeras = sc.nextDouble();
                ventaManzanas = ventaManzanas *2.35;


                ventasPeras = ventasPeras *1.95;
                beneficiosAnuales = ventaManzanas += ventasPeras;

                System.out.println(" beneficios anuales de beneficios es de : " + beneficiosAnuales);




    }
}
