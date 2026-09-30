package Octativas;
import java.util.Scanner;
public class Octativa4 {
    static void main(String[] args) {

        //Variables

        double baseTriangulo;
        double alturaTriangulo;
        double ladoCuadrado;
        double baseRectangulo;
        double alturaRectangulo;
        double areaTriangulo;
        double areaCuadrado;
        double areaRectangulo;

        //Sistema de entrada

        Scanner sc = new Scanner(System.in);

        //Pedir y Alamcenar info del triangulo

        System.out.println("Digite la base del triangulo");
        baseTriangulo = sc.nextDouble();
        System.out.println("Digite la altrua del triangulo");
        alturaTriangulo = sc.nextDouble();

        //Calcular area del triangulo

        areaTriangulo = (alturaTriangulo * baseTriangulo)/2;

        //Imprimir

        System.out.println("El area de su triangulo es " + areaTriangulo);

        //Pedir y almacenar info del cuadrado

        System.out.println("Digite el lado de su cuadrado");
        ladoCuadrado = sc.nextDouble();

        //Calcular area cuadrado

        areaCuadrado = Math.pow(ladoCuadrado, 2);

        //Imprimir

        System.out.println("El area de su cuadrado es " + areaCuadrado);

        //Pedir y Almacenar info del rectangulo

        System.out.println("Digite la base del rectangulo");
        baseRectangulo = sc.nextDouble();
        System.out.println("Digite la altura del rectangulo");
        alturaRectangulo = sc.nextDouble();

        //Calcular area rectangulo

        areaRectangulo = baseRectangulo * alturaRectangulo;

        //Imprimir

        System.out.println("El area de su rectangulo es " + areaRectangulo);










    }
}
