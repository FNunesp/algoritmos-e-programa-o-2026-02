import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        /* Exercício 6 - Validador de entrada
● Enunciado: construa um algoritmo que simule o cadastro de senhas numéricas. O sistema
deve solicitar que o usuário digite uma senha inteira de 4 dígitos. Enquanto o valor digitado
for diferente da senha pré-definida (por exemplo, 2026), exiba a mensagem "Senha
Incorreta! Tente novamente" e solicite um novo valor. Quando acertar, exiba "Acesso
Autorizado!" e o número total de tentativas realizadas.
● Conceito-chave: laço condicional com teste no início (while), condição de parada e
acumulador/contador de tentativas.
○ EXTRA: mude o tipo de dado da senha de int para String. Realize novos testes. Algo
mudou? Se sim, como resolver?

        */


        /* exercicio feito com string, pois com int dava erro,quando a pessoa digitava 0002026 dava senha correta mesmo n sendo

         */

        Scanner entrada = new Scanner(System.in);

        String senha = "0";
        String senhaPreDefinida = "2026";
        int tentativas = 0;

        while(!senha.equals(senhaPreDefinida)) {
            System.out.println("Digite a senha: ");
            senha = entrada.nextLine();

            tentativas++;

            if(!senha.equals(senhaPreDefinida)){

                System.out.println("Senha incorreta ! Tente Novamente.");
            }else{
                System.out.println("Acesso Liberado !");
            }

        }

        System.out.println("Tentativas realizadas: " + tentativas);





    }
}