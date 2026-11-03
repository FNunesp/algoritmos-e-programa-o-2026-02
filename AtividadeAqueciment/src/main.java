import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nome = entrada.nextLine();

        System.out.print("Digite o preço do produto: ");
        double preco = entrada.nextDouble();

        System.out.print("Digite a quantidade em estoque: ");
        int quantidadeEstoque = entrada.nextInt();

        produto produto = new produto(nome, preco, quantidadeEstoque);

        System.out.println("\n--- Dados do produto ---");
        produto.exibirInformacoes();

  
    }
}