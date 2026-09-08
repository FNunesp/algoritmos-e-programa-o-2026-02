import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*Faça um algoritmo em Java que leia a quantidade de kWh consumidos por uma residência em um mês e calcule e mostre o valor da conta de energia elétrica, seguindo as regras:
●	Até 100 kWh = R$ 0,50 por kWh
●	De 101 até 200 kWh = R$ 0,70 por kWh
●	Acima de 200 kWh = R$ 0,90 por kWh
*/

        Scanner entrada = new Scanner(System.in);

        double kwh;

        System.out.print("Informe a quantidade de kWh consumido: ");
        kwh = entrada.nextDouble();



        if(kwh <= 100) {

            double consumo_100 = kwh * 0.50;

            System.out.print("A sua conta a pagar ficou:" + consumo_100);
        }else if (kwh <= 200) {

            double consumo_200 = kwh * 0.70;

            System.out.print("A sua conta a pagar ficou: " + consumo_200);

        }else {

            double consumo_300 = kwh * 0.90;

            System.out.print("A sua conta a pagar ficou:" + consumo_300 );

        }












    }
}