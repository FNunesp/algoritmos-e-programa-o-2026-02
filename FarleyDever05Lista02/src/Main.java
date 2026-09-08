import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

/* Faça um algoritmo que leia uma temperatura em graus Celsius e pergunte ao usuário para qual unidade ele deseja converter. Peça a ele para digitar 1 se desejar converter para Fahrenheit (F=C×1.8+32) ou digitar 2 se desejar para Kelvin (K=C+273.15). Caso o usuário digite uma opção diferente, exiba uma mensagem de opção inválida.
*/

        Scanner entrada = new Scanner(System.in);

        double temperatura;
        int opcao;


        System.out.println("Digite a temperatura em graus Celsius:");
        temperatura = entrada.nextDouble();

        System.out.println("Digite 1 para converter para Fahrenheit ou 2 para converter para Kelvin");
        opcao = entrada.nextInt();

        if(opcao == 1){

            double Fahrenheit = temperatura * 1.8 + 32;

            System.out.println("A temperatura em Fahrenhoit é: " + Fahrenheit);

        }else if(opcao == 2){

            double Kelvin = temperatura + 273.15;

            System.out.println("A temperatura em Kelvin é: " + Kelvin);

        }else {

            System.out.println("Opção Inválida");

        }











    }
}