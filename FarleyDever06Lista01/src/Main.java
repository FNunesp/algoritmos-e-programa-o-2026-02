import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double salario;

        System.out.print("Informe o salário do funcionário: ");
        salario = entrada.nextDouble();

        double aumento = 0.07;


        double aumentoSalario = salario * aumento;
        System.out.println("O aumento foi R$" + aumentoSalario);


        double novoSalario = aumentoSalario + salario;
        System.out.print("O novo salário do funcionário é: " + novoSalario  );














    }
}