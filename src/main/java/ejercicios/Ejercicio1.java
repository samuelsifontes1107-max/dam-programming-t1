package ejercicios;
import java.util.Scanner;
public class Ejercicio1 {
    static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int numero;
        System.out.println("Introduce un numero entero");
        numero = sc.nextInt();
        System.out.println("tu numero es " + numero);



        double precio;
        System.out.println("INTRODUCE UN PRECIO");
        precio = sc.nextDouble();
        System.out.println("El precio introducido " + precio + " euros");
    }
}
