import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

 /*04 - O gerente de uma loja deseja acompanhar o faturamento dos 5 dias úteis da semana (de Segunda a Sexta-feira). Escreva um programa em Java que:

Solicite ao usuário o valor total de vendas (R$) de cada um dos 5 dias.
Calcule e exiba o faturamento total acumulado e a média diária de vendas da semana.
Identifique e exiba na tela quais dias da semana ficaram abaixo da média diária calculada (ex: "Dia 2 ficou abaixo da média com R$ 150,00").

     */

        Scanner entrada = new Scanner(System.in);

        double[] vendas = new double[5];

        String[] dias = {
                "Segunda-feira",
                "Terça-feira",
                "Quarta-feira",
                "Quinta-feira",
                "Sexta-feira"
        };

        double total = 0;


        for (int i = 0; i < 5; i++) {

            System.out.println("Informe o valor de vendas de " + dias[i] + ": ");
            vendas[i] = entrada.nextDouble();

            total = total + vendas[i];
        }

        double media = total / 5;

        System.out.println("Faturamento total da semana: R$ " + total);
        System.out.println("Média diária de vendas: R$ " + media);


        for (int i = 0; i < 5; i++) {

            if (vendas[i] < media) {

                System.out.println(dias[i] +
                        " ficou abaixo da média com R$ " + vendas[i]);
            }
        }
        
    }
}