import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

       //Faça um algoritmo que leia três números inteiros e mostre qual deles é o maior.

        Scanner entrada = new Scanner(System.in);

        int numero1;
        int numero2;
        int numero3;

        System.out.println("Digite o primeiro número: ");
        numero1 = entrada.nextInt();

        System.out.println("Digite o segundo número: ");
        numero2 = entrada.nextInt();

        System.out.println("Digite o terceiro número: ");
        numero3 = entrada.nextInt();

        if(numero1 > numero2 && numero1 > numero3){

            System.out.println("O número digitado maior é:" + numero1);

        }else if(numero2 > numero1 && numero2 > numero3) {   //O "&&" significa "e"

            System.out.println("O número digitado maior é:" + numero2);

        }else{

            System.out.println("O número digitado maior é:" + numero3);
        }












    }
}