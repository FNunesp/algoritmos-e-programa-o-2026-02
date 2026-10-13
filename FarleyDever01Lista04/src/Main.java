import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        /*Faça um algoritmo que peça ao usuário um número inteiro e em seguida mostre o fatorial desse número

         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        long fatorial = 1;

        for (int i = numero; i >= 1; i--) {
            fatorial = fatorial * i;
        }

        System.out.println("O fatorial de " + numero + " é: " + fatorial);

        

    }
}