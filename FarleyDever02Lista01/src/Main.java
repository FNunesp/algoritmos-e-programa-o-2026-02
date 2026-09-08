import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero1;
        int numero2;
        int numero3;

        System.out.print("Digite o primeiro número: ");
        numero1 = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        numero2 = entrada.nextInt();

        System.out.print("Digite o terceiro número: ");
        numero3 = entrada.nextInt();

        int soma = numero1 + numero2 + numero3;

        System.out.println("A soma dos números é: " + soma);

        double media = (numero1 + numero2 + numero3) / 3;

        System.out.println("A média dos números é: " + media);








    }
}