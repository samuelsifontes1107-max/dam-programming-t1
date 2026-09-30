package Octativas;
import java.util.Scanner;
public class Octativa2 {
    static void main(String[] args) {

        //Variables

        double milimetros;
        double centimetros;
        double metros;
        double resultadoCentimetros;

        //Pedir datos y guardarlos
        Scanner sc = new Scanner(System.in);
        System.out.println("Intruce los milímetros");
        milimetros = sc.nextDouble();
        System.out.println("Introduce los centìmetros");
        centimetros = sc.nextDouble();
        System.out.println("Introduce los metros");
        metros = sc.nextDouble();

        //Calculos

        resultadoCentimetros = (milimetros/10.0) + centimetros + (metros*100.0);

        //Resultado

        System.out.println("La suma total de los centimetros es " + resultadoCentimetros);

    }
}
