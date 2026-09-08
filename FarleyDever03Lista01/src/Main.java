import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int idade;

        System.out.print("Digite sua idade: ");
        idade = entrada.nextInt();

        int Conversão = idade * 12;
        System.out.print("Sua idade em meses é: " + Conversão);
    }
}