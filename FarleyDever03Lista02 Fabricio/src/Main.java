import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



/*Construa um algoritmo que recebe um número e em seguida exiba uma mensagem, informando se ele é par ou ímpar. No primeiro caso, também deve ser exibida uma mensagem informando qual é o quadrado do valor informado, no segundo caso, deve também ser exibida uma mensagem informando qual o é o cubo deste número.

*/

        Scanner entrada = new Scanner(System.in);

        int numero;

        System.out.print("Informe um número: ");
        numero = entrada.nextInt();

        if(numero % 2 == 0){

            System.out.println("O número é par");

            int quadrado = numero * numero;

            System.out.print("O quadrado do número é:" + quadrado);


        }else {

            System.out.println("O número é impar");

            int cubo = numero * numero * numero;

            System.out.print("O cubo do número é:" + cubo);
        }
















    }
}