package Octativas;
import java.util.Scanner;
public class Octativa5 {
    static void main(String[] args) {

        //Declarar Variables

        long dias;
        long horas;
        long minutos;
        long segundos;
        long milisegundos;

        //Sistema de entrada
        Scanner sc = new Scanner(System.in);

        //Solicitar y almacenar datos

        System.out.println("Digite los días");
        dias = sc.nextLong();
        System.out.println("Digite los horas");
        horas = sc.nextLong();
        System.out.println("Digite los minutos");
        minutos = sc.nextLong();
        System.out.println("Digite los segundos");
        segundos = sc.nextLong();

        //Calculos

        milisegundos = (dias * 86400000) + (horas * 3600000) + (minutos * 60000) + (segundos * 1000);

        //Imprimir

        System.out.println("Su equivalencia en milisegundos es " + milisegundos);


    }
}
