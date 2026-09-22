import javax.swing.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*
        Exercício 8 - Estatísticas de coleta e maior/menor valor
● Enunciado: uma ONG precisa processar dados sobre doações comunitárias. Faça um
programa que leia a quantidade total de doações recebidas no dia. Em seguida, leia os
valores doados em reais (por exemplo: se antes foi informado que foram 5 doações, então
devem ser lidos os valores dessas 5 doações) . O algoritmo deve determinar e exibir:
1. O valor total arrecadado.
2. O maior valor individual doado.
3. O menor valor individual doado.
         */


        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de doações: ");
        int quantidade = scanner.nextInt();

        double total = 0;
        double maior = 0;
        double menor = 0;

        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Digite o valor da doação " + i + ": R$ ");
            double doacao = scanner.nextDouble();

            total += doacao;

            if (i == 1) {
                maior = doacao;
                menor = doacao;
            } else {
                if (doacao > maior) {
                    maior = doacao;
                }

                if (doacao < menor) {
                    menor = doacao;
                }
            }
        }

        System.out.printf("%nTotal arrecadado: R$ %.2f%n", total);
        System.out.printf("Maior doação: R$ %.2f%n", maior);
        System.out.printf("Menor doação: R$ %.2f%n", menor);

        scanner.close();
    }
}















