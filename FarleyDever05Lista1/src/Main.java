import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double altura;
        double peso;


        System.out.print("Informe sua altura:");
        altura = entrada.nextDouble();

        System.out.print("Informe seu peso:");
        peso = entrada.nextDouble();

        double imc = (peso/(altura*altura));

        System.out.printf("Seu IMC é: %.2f%n " , imc);

if(peso <= 20) {
    System.out.println("vc esta muito magro");
}else if (peso > 21){
    System.out.println("voce esta na media");
}else if (peso < 89){
    System.out.println("voce esta na media");
}else{
    System.out.println("voce esta obeso");
}




    }
}