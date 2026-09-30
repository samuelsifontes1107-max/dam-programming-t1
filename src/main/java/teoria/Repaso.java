package teoria;

import java.util.Scanner;

public class Repaso {
    static void main(String[] args) {

        //Definir variables

        int numero;
        int resultado;
        Scanner sc = new Scanner(System.in);

        //Pedir numero

        System.out.println("Introduce un número");
        numero = sc.nextInt();

        //Caculo

        resultado = numero * 2;
        System.out.println("El doble de tu numero es " + resultado);


    }
}
