import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

      /*  Exercício 7 - Acumulador e cálculo de média
● Enunciado: crie um programa que permita ao usuário inserir sucessivas notas de alunos
        (valores reais positivos). A leitura deve continuar repetidamente até que o usuário digite um
        valor negativo (um “flag” de encerramento, como -1). Ao final, o programa deve apresentar:
        1. A quantidade de notas válidas digitadas.
        2. A média aritmética simples dessas notas (com duas casas decimais).
● Atenção: o sistema deve verificar se ao menos uma nota válida foi digitada antes de
        calcular a média, evitando divisão por zero.
● Conceito-chave: laço (while ou do-while), soma cumulativa (soma += nota) e prevenção de
        erros lógicos.

       */

        Scanner entrada = new Scanner(System.in);

        double nota = 0;
        double somaTotal = 0;
        int quantidade = 0;

        while(nota >=0) {

            System.out.println("Informe a nota: ");
            nota = entrada.nextDouble();

            if(nota >= 0){
                somaTotal += nota;
                quantidade++;

            }


        }

        System.out.println("A quantidade de notas válidas foi: " + quantidade);


        if (quantidade > 0) {

            double media = somaTotal/quantidade;
            System.out.printf("A média das notas válidas é: %.2f%n" , media);

        }else {

            System.out.println("Nenhuma nota válida foi digitada");
        }












    }
}