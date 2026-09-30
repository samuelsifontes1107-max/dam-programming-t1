package teoria;
//Pao1:Importar la funcionalidad de Scanner
import java.util.Scanner;

public class SolicitarDatos {
    static void main(String[] args) {


        //Paso2: Crear un scanner llamado sc
        //y lo conectamos a la entrada del sistema que es el teclado
        Scanner sc = new Scanner(System.in);

        double numero;//Definir variable: numero
        //System.out.println("Introduce un numero"); //Imprimir: "Introduce un número"
        numero = sc.nextDouble();   //Paso3:
                                   //Leer numero
                                  //Como vamos a leer un número decimal elgimos sc.nextDouble
        System.out.println("has escrito " + numero);

    }
}
