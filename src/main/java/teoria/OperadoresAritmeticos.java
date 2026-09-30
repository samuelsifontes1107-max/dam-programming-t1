package teoria;

public class OperadoresAritmeticos {
    static void main(String[] args) {

        int numeroA = 3;
        int numeroB = 7;
        int numeroC = 10;
         //Sumar +

        int resultadoSuma = numeroA + numeroB + numeroC;

        System.out.println("el total de la operación es " + resultadoSuma);
        //3 + 7 + 10 = 20
        System.out.println(numeroA + " + " + numeroB + " + " + numeroC + " = " + resultadoSuma);

        //Resta -

        int resultadoResta = numeroA - numeroB;
        System.out.println("el resultado de la suma es " + resultadoResta);
        System.out.println(numeroA + "+" + numeroB + "=" + resultadoResta);

        //División *

        int resultadoDivision = numeroC / 5;
        System.out.println("Resultado de la división es " + resultadoDivision);
        System.out.println(numeroC + "/5 = " + resultadoDivision );

        //Muntiplicación *

        int resultadoMultiplicacion = numeroA * 2;

        System.out.println("El resultado de la multiplicación es es " + resultadoMultiplicacion);
        System.out.println(numeroA + "*2 = " + resultadoMultiplicacion);

        //Operaciones combiandas

        int resultado = (numeroA * 2) - (numeroC / 5);
        System.out.println("El resultado es " + resultado);
        System.out.println("("+ numeroA +"*2) - (" + numeroC + "/5) = " + resultado);


        //OPERADOR DE INCREMENTO ++-> suma 1 a la variable
        //OPERADOR DE DECREMENTO ---> resta 1 a la variable

        int dato = 3;

        dato++; //Sumamos 1 a la varuable dato, pasa a valer 4
        System.out.println("Dato despues del incremento: " + dato);

        dato--; //Restamos a la variuable dato, entonces pasa a valer 3
        System.out.println("Dato despues del decremento: " + dato);


        int cantidad = 20;
        cantidad = cantidad + 1; // Es equivalente cantidad++
        System.out.println("Cantidad deespúes del incremento: " + cantidad);


        //Operadores menos unario -ALGO
        //Cambia de signo a la expresión que le sigue
        //Es como multiplicar por -1

        int valor = 1;
        int otroValor = -valor; //otro vale - valor, es decir, -1

        System.out.println("Variable de otro Otrovalor: " + valor);
        System.out.println("Variable de otro valor: " +otroValor);


        int operacion = -(2 * valor - 4); // -(2 * 1 - 4) = -(-2) = 2
        System.out.println("Operacion: " + operacion);

        //Operadores Módulo &
        //a % b = resto de dividir a entre b
        //Ver ejrcicio8

        //Posicicón prefija y postfija
        //Prefija -> ++a
        //El incremento tiene prioridad sobre el resto de operaciones


        int numerox = 23;
        int numeroy = ++numerox;

        System.out.println("Numero 1: " + numerox);
        System.out.println("Numero 2: " + numeroy);

        int numero3 = 33;
        int numero4 = numero3++;

        System.out.println("Número 3: " + numero3);
        System.out.println("Número 4: " + numero4);


    }
}