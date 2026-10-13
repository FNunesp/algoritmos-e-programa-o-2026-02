import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*05 - Um fiscal de qualidade mediu o peso (em kg) de 6 caixas em uma linha de produção. Logo após digitar os 6 pesos, o sistema deve pedir para o fiscal digitar um peso de referência para pesquisa. O programa deve analisar a lista informada e exibir:

Quantas vezes aquele peso específico foi encontrado.
Se o peso não foi encontrado em nenhuma das caixas, exibir: "Valor não localizado na
amostragem".
         */

        Scanner entrada = new Scanner(System.in);

        int quantidade = 0;

        double[] peso = new double[6];

        String[] nomespeso = {
                "Primeiro peso",
                "Segundo peso",
                "Terceiro peso",
                "Quarto peso",
                "Quinto peso",
                "Sexto peso"
        };

        for (int i = 0; i < 6; i++) {

            System.out.println("Digite o " + nomespeso[i] + ":");
            peso[i] = entrada.nextDouble();
        }

        System.out.println("Digite um peso referência: ");
        double referencia = entrada.nextDouble();

        for (int i = 0; i < 6; i++) {

            if (peso[i] == referencia) {
                quantidade++;
            }
        }

        if (quantidade > 0) {

            System.out.println("O número de vezes que o peso referência apareceu foi: " + quantidade);

        } else {

            System.out.println("Valor não localizado na amostragem");
        }























    }
}