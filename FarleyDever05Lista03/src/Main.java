import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


/*Exercício 5 - Gerador de tabuada
● Enunciado: desenvolva um programa que solicite ao usuário um número inteiro qualquer.
Utilizando um laço de repetição determinado, calcule e exiba a tabuada desse número de 1
a 10 no formato: numero x i = resultado
● Conceito-chave: estrutura de repetição contada (for), controle de variável contadora e
formatação de saída.

 */

        Scanner entrada = new Scanner(System.in);

         System.out.print("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        for(int i = 1; i < 11; i++) {

            System.out.println(numero + " x " + i + " = " + numero * i);
        }


        



    }
}