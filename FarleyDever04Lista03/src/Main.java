import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

      /* Exercício 4 - Repetição de mensagem personalizada
● Solicite ao usuário um número inteiro N. Em seguida, exiba a mensagem "Praticando lógica
de programação!" exatamente N vezes no console.
● Foco: Controlar o limite superior do laço utilizando uma variável digitada pelo usuário via
Scanner

    */

        Scanner entrada = new Scanner(System.in);


        System.out.println("Digite um número inteiro: ");
        int numero = entrada.nextInt();


        for(int i = 0; i < numero; i++) {

            System.out.println("Praticando lógica de programação !");
        }

        /* -Como não sabemos o valor que a pessoa vai digitar ent o i fica igual a 0
        -Considerando que o usuário digite 5 por exemplo ent no "for" deve colocar <5 pq ele ja vai adicionar mais um após o 4 aí vai ver que chegou no 5 e parar
         */



















    }
}