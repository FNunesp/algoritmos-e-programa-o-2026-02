import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);

        int codigo;
        int quantidade;
        double precoUnitario;
        double precoTotal; double desconto;
        double precoFinal;


        System.out.print("Digite o código do produto: ");
        codigo = entrada.nextInt();

        System.out.print("Digite a quantidade: ");
        quantidade = entrada.nextInt();


        if (codigo >= 1 && codigo <= 10) {

            precoUnitario = 10.00;

        } else if (codigo >= 11 && codigo <= 20) {

            precoUnitario = 15.00;

        } else if (codigo >= 21 && codigo <= 30) {

            precoUnitario = 20.00;

        } else if (codigo >= 31 && codigo <= 40) {

            precoUnitario = 30.00;

        } else {

            precoUnitario = 0;
        }


        precoTotal = precoUnitario * quantidade;


        // Calcula o desconto

        if (precoTotal <= 250) {

            desconto = precoTotal * 0.05;

        } else if (precoTotal <= 500) {

            desconto = precoTotal * 0.10;

        } else {

            desconto = precoTotal * 0.15;

        }

        // Calcula o preço final


        precoFinal = precoTotal - desconto;


        System.out.println("\nPreço unitário: R$ " + precoUnitario);
        System.out.println("Preço total: R$ " + precoTotal);
        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Preço final: R$ " + precoFinal);


    }
}