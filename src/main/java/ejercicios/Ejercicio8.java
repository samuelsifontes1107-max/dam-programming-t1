package ejercicios;
import java.util.Scanner;
public class Ejercicio8 {
    static void main(String[] args) {

        //Declarar las variables

        int numero1;
        int numero2;
        int resto;

        Scanner sc = new Scanner(System.in);

        // Pedri y guardad numero
        System.out.println("Introduce el primer numero");
        numero1 = sc.nextInt();
        System.out.println("Introduce el segundo numero");
        numero2 = sc.nextInt();

        //calcular

        resto = numero1 % numero2;

        //Imprimir

        System.out.println("Tu resto es " +resto);


    }
}
