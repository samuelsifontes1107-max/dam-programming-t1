package ejercicios;
import java.util.Scanner;

public class Ejercicio5 {
    static void main(String[] args) {

        //Definir variables

        int notas;
        int nota2;
        double notaFinal;

        Scanner sc =new Scanner(System.in);

        System.out.println("Introduce tu nota 1");
        notas = sc.nextInt();
        System.out.println("Introduce tu nota 2");
        nota2 = sc.nextInt();

        notaFinal = (notas + nota2)/2.0;

        System.out.println("Tu nota final es " + notaFinal);
    }
}
