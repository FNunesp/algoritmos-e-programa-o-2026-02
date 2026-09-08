import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);


        double renda;
        double prestacao;

        System.out.print("Digite sua renda mensal: R$ ");
        renda = entrada.nextDouble();

        System.out.print("Digite o valor da prestação: R$ ");
        prestacao = entrada.nextDouble();

        if (prestacao > renda * 0.30) {

            System.out.println("Financiamento negado por alta prestação");

        } else if (prestacao > 3000 && renda < 10000) {

            System.out.println("Financiamento negado por baixa renda");

        } else {

            System.out.println("Financiamento aprovado");
        }







    }
}