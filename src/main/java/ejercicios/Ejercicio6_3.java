package ejercicios;

import java.util.Scanner;

public class Ejercicio6_3 {
    static void main(String[] args) {

        //Definir variables
        double radio;
        double area;
        double perimetro;

        //Llamar al scanner y pedir datos
        Scanner sc = new Scanner(System.in);
        System.out.println("Indroduce el radio");

        //Guardar el scaner
        radio = sc.nextDouble();

        //Hacer el calcúlos
        //Math.pow(base, exponente)
        area = (Math.PI) * Math.pow(radio, 2);
        perimetro = (2 * Math.PI) * radio;

        //Imprimir resultado
        System.out.println("El area es " + area);
        System.out.println("El peremitro es " + perimetro);

    }
}
