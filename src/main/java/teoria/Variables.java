package teoria;

import jdk.swing.interop.SwingInterOpUtils;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class Variables {

    static void main(String[] args) {

        //Una variable es la representación de un valor
        // a través de un identificador
        int a = 3; //Creo(declarar) la variable "a"
                   //y guardo (asigno) el valor 3
        System.out.println(a);
        int b = a + 10; //Creo(declarar) la variable "b"
                        //y le asigno el valor de "a" + 10
                       //entonces b vale 13
        System.out.println(b);

        //Nombre de las variables (identificador)
        //* Representativo
        //* Ni muy largo, ni muy corto
        //* Empezar letra, _, $
        //* Resto de caracteres: letra, _, $, dígito
        //* edad no es lo mismo EDad

        //TIPOS DE VARIABLES
        //ELEGIMOS EL TIPO DE LA VARIABLE
        //En función del dato que guarda
        // INT: Entero
        // DOUBLE: Decimal
        // LONG: Entero muy grande
        //CHAR: Un caracter


        //Creacion de varaibles
        //Tipo, identificador = valor;

        //Declaracion y asignacion en 1 instrucción
        double importe = 5.50; //Declaro la variable "importe" de tipo double
                               //Le asigno el valor 5.50
        System.out.println(importe);

        //Declaracion y asignacion en 2 instrucciones
        double precio;//Declaro la variable "precio"
        precio = 1.20;//Guardo a la variable "precio" el valor 1.20
        System.out.println(precio);





        //CREACION MUNTIPLE
        //Podemos crear varias variables en la misma linea
        //siempre y cuando sean del mismo tipo
        double ventasEnero, ventasFebrero = 9.50, ventasMarzo;
        ventasEnero = 10.20;
        ventasMarzo = 50.10;

        System.out.println(ventasEnero);
        System.out.println(ventasFebrero);
        System.out.println(ventasMarzo);

        //Esto es un comebtario en linea
        /*Esto
        * es
        * un
        * comentario
        * multilinea*/






    }
}
