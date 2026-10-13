import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        /*03 - Uma estação meteorológica precisa registrar a temperatura média dos 5 primeiros dias da semana (de Segunda a Sexta-feira). Escreva um programa em Java que:

Peça para o usuário digitar a temperatura de cada um dos 5 dias.
Calcule e exiba a temperatura média da semana.
Identifique e exiba quais dias (ex: "Dia 1" , "Dia 3" , ou “Segunda-feira” , “Terça-feira” ...) tiveram temperatura estritamente acima da média calculada.

*/
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a temperatura de Segunda-Feira: ");
        double segunda = entrada.nextDouble();

        System.out.println("Digite a temperatura de Terça-Feira: ");
        double terca = entrada.nextDouble();

        System.out.println("Digite a temperatura de Quarta-Feira: ");
        double quarta = entrada.nextDouble();

        System.out.println("Digite a temperatura de Quinta-Feira: ");
        double quinta = entrada.nextDouble();

        System.out.println("Digite a temperatura de Sexta-Feira: ");
        double sexta = entrada.nextDouble();

        double media = (segunda + terca + quarta + quinta + sexta) / 5;

        System.out.println("A temperatura média da semana é: " + media + " graus ");


        double[] temperaturas = {segunda, terca, quarta, quinta, sexta};

        String[] dias = {
                "Segunda-feira",
                "Terça-feira",
                "Quarta-feira",
                "Quinta-feira",
                "Sexta-feira"
        };

        System.out.println("Dias com temperatura acima da média:");

        for (int i = 0; i < 5; i++) {
            if (temperaturas[i] > media) {
                System.out.println(dias[i]);
            }
        }

    }
}