package ejercicios;
import java.util.Scanner;
public class Ejercicio7 {
    static void main(String[] args) {

        // Declarar las variables
        double a;
        double b;
        double x;
        double c;
        double resultado;

        //Sistema de Entrada
        Scanner sc = new Scanner(System.in);

        //Pedir info y guardarla

        System.out.println("Introduce el valor de A");
        a = sc.nextDouble();
        System.out.println("Introduce el valor de B");
        b = sc.nextDouble();
        System.out.println("Introduce el valor de X");
        x = sc.nextDouble();
        System.out.println("Introduce el valor de C");
        c = sc.nextDouble();

        //Calcular

        resultado = a * Math.pow(x, 2) + (b * x) + c;

        //Imprimir

        System.out.println("El resultado del polinomio es " + resultado);

    }
}
