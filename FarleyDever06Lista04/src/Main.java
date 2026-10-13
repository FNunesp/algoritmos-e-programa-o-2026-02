import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        /*06 - Jogo de adivinhação

Defina um número secreto fixo no programa (por exemplo, int numeroSecreto = 42;). Crie um programa em que o usuário tenta adivinhar o número. A cada tentativa incorreta, o programa deve informar se o número secreto é MAIOR ou MENOR que o palpite digitado e pedir um novo palpite. Cada número errado deve ser armazenado em um vetor (array). O laço só encerra quando o usuário acertar o número, exibindo no final quantas tentativas foram necessárias. Devem ser exibidos também todos os palpites errados que o usuário deu.

Exemplo de resultado:

"Parabéns, você adivinhou! O número secreto é 42!"

Tentativas: 6

Palpites:
1) 12
2) 50
3) 30
4) 40
5) 44
6) 42

         */


        Scanner entrada = new Scanner(System.in);

        int numeroSecreto = 7;
        int numero = 0;

        int[] palpites = new int[100];
        int posicao = 0;
        int tentativas = 0;

        do {

            System.out.println("Digite seu palpite: ");
            numero = entrada.nextInt();

            tentativas++;

            if (numero > numeroSecreto) {
                System.out.println("O número secreto é MENOR!");
            } else if (numero < numeroSecreto) {
                System.out.println("O número secreto é MAIOR!");
            }

            if (numero != numeroSecreto) {
                palpites[posicao] = numero;
                posicao++;
            }

        } while (numero != numeroSecreto);

        System.out.println();
        System.out.println("Parabéns, você acertou!");
        System.out.println("O número secreto é " + numeroSecreto + "!");
        System.out.println("Tentativas: " + tentativas);

        System.out.println();
        System.out.println("Palpites errados:");

        for (int i = 0; i < posicao; i++) {
            System.out.println((i + 1) + ") " + palpites[i]);
        }




    }
}