import javax.management.PersistentMBean;
import java.sql.SQLOutput;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual sua idade ? ");
        int idade = entrada.nextInt();

        System.out.println("Qual o seu peso? ");
        double peso = entrada.nextInt();

        double mgPorml = 500;
        int gotasporMl = 20;
        int dosagem;

        if (idade >= 12){
            if (peso >= 60) {
                dosagem = 1000;
            }else {
                dosagem = 875;
            }
        }else{
            if (peso >= 5 && peso <= 9) {
                dosagem = 125;

            }else if (peso >= 9.1 && peso <= 16){
                dosagem = 250;
            }else if(peso >= 16.1 && peso <= 24) {

                dosagem = 375;
            }else if(peso >= 24.1 && peso <= 30) {
                dosagem = 500;
            }else{
                dosagem = 750;
            }
        }

        double ml = dosagem / mgPorml;

        double gotas = ml * gotasporMl;

        System.out.println("Dosagem: " + dosagem + "mg");
        System.out.println("Gotas: " + gotas);




    }
}