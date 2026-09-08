import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int idade;

        System.out.print("Informe sua idade: ");
        idade = entrada.nextInt();

        if(idade <= 12 ) {

            System.out.println("Sua categoria é infantil");

        }else if(idade <= 17) {

            System.out.println("Sua categoria é Juvenil");

        }else {

            System.out.println("Sua categoria é Adulto");

        }












    }
}