package Octativas;
import java.util.Scanner;
public class Octativa3 {
    static void main(String[] args) {

        //Declarar las variables

        double base;
        double iva;
        double resultadoiva;
        double resultadoTotal;

        Scanner sc = new Scanner(System.in);

        //Pedir y almacenar

        System.out.println("Introduce tu valor base ");
        base = sc.nextDouble();
        System.out.println("Introduce tu de IVA ");
        iva = sc.nextDouble();

        //Calculos

        resultadoiva  = base * (iva/100.0);
        resultadoTotal = resultadoiva + base;

        System.out.println("Tu iva es " + resultadoiva);
        System.out.println("Tu resultado total es " + resultadoTotal);





    }
}
