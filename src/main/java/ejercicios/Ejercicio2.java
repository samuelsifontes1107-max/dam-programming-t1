package ejercicios;
//Importar escanner
import java.util.Scanner;

public class Ejercicio2 {
    static void main(String[] args) {

        //Variables

        int anyoActual;
        int anyoNacimiento;
        int edad;
        Scanner sc = new Scanner(System.in);

        //Pedir datos

        System.out.println("Introduce el año actual");
        anyoActual = sc.nextInt();

        System.out.println("Introduce tu año de nacimiento");
        anyoNacimiento = sc.nextInt();

        //Calcular

        edad = anyoActual - anyoNacimiento;

        //Dar Resultado

        System.out.println("Tu edad actua es " + edad);


    }

}
