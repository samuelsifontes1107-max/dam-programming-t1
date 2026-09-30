package PRACTICASsamueldam;
import java.util.Scanner;
public class practiac2 {
    static void main(String[] args) {

        int fechaNacimiento;
        int fechaActual;
        Scanner sc= new Scanner(System.in);
        System.out.println("IntreduceNacimiento");
        fechaNacimiento = sc.nextInt();
        System.out.println("introduceFechaActual");
        fechaActual=sc.nextInt();
        int resultado= fechaNacimiento - fechaActual;
        System.out.println("usted tiene" +resultado+ "anyos");
    }
}
