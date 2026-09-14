import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


/* 1. Codifique um programa que calcule a função f(x) de acordo com a seguinte definição


f(x) =

1, se x ≤ 1
2, se 1 < x ≤2
x2, se 2 < x ≤ 3
x3, se x > 3

*/

        Scanner entrada = new Scanner(System.in);



        double resultado;


        System.out.println("Digite o valor de X: ");


        double x = entrada.nextDouble();



        if (x <= 1) {

            resultado = 1;

        }else if (x > 1 && x <= 2) {

            resultado = 2;

        }else if (x > 2 && x <= 3 ){


            resultado = x * x;

        }else if (x > 3) {

            resultado = x * x * x;

        }else{

            System.out.println("O valor digitado não é compatível");
            return;
        }

        System.out.println("O resultado é: " + resultado );







    }
}