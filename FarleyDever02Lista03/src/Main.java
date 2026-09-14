import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        /*  Codifique um programa para calcular as raízes de uma equação do segundo grau,ax2+bx+
c = 0. Os valores dos coeficientes devem ser lidos pelo teclado. Devem ser observadas as
seguintes situações:
(a) a = 0,não se trata de uma equação do segundo grau;
(b) delta < 0,nãoexistem raízes reais;
(c) delta > 0,existem duas raízes reais diferentes;
(d) e delta = 0,existemduasraízes reais iguais

    */


        Scanner entrada = new Scanner(System.in);

        int a;
        int b;
        int c;

        System.out.println("Digite o valor de A: ");
        a = entrada.nextInt();

        System.out.println("Digite o valor de b: ");
        b = entrada.nextInt();

        System.out.println("Digite o valor de c: ");
        c = entrada.nextInt();

        if(a == 0){

            System.out.println("Não é uma equação do segundo grau");
            return;
        }

        double delta = b * b - 4 * a * c;

        if(delta > 0) {

            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("São duas raízes reais e distintas." + "O x1 é" + x1 + "O x2 é " + x2);


        }else if(delta < 0) {
            System.out.println("não existem raízes reais: " + delta);

        }else {

            double raizIgual = -b / (2.0*a);
            System.out.println("Existem duas raízes reais iguais ! O valor é " + raizIgual);

        }




    }
}