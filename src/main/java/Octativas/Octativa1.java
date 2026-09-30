package Octativas;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;
public class Octativa1 {
    static void main(String[] args) {


        //Variables

        int aranyas;
        int hormigas;
        int cochinillas;
        int resultado;
        Scanner sc = new Scanner(System.in);

        //Pedri datos

        System.out.println("Introduce las arañas observadas");
        aranyas = sc.nextInt();
        System.out.println("Introduce las hormigas observadas");
        hormigas = sc.nextInt();
        System.out.println("Introduce las cochinillas observadas");
        cochinillas = sc.nextInt();

        //Caculos

        resultado = hormigas * 6 + aranyas * 8 + cochinillas * 14;

        System.out.println("El numero total de pastas observadas es " + resultado);


    }
}
