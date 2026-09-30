package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
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

        //Hacer el calcúlo
        area = (3.14) * (radio * radio);
        perimetro = (2 * 3.14) * radio;

        //Imprimir resultado
        System.out.println("El area es " + area);
        System.out.println("El peremitro es " + perimetro);

    }
}
