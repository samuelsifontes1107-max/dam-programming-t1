    package PRACTICASsamueldam;

    import java.util.Scanner;

    public class practica4 {
        static void main(String[] args) {
            //calcular area del cuadrado
            Scanner sc= new Scanner(System.in);
            double cuadrado;
            double base;
            double lado;
            System.out.println("ingrese la base del triangulo");
            base = sc.nextDouble();
            System.out.println("ingrese lado del triangulo");
            lado = sc.nextDouble();
            double resultado = lado * base;
            System.out.println(resultado);



        }

    }
