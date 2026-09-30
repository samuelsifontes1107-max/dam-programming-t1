package ejercicios;
import java.util.Scanner;
public class Ejercicio3 {
    static void main(String[] args) {

        //Declarar variables
        int edad;

        Scanner sc = new Scanner(System.in);

        //Pedir edad

        System.out.println("Introduce tu edad");
        edad = sc.nextInt();

        // Calculos

        edad++;

        System.out.println("Tu edad en un año será " + edad);


    }
}
