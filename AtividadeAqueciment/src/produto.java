public class produto {
        String nome;
        double preco;
        int quantidadeEstoque;

        public produto(String nome, double preco, int quantidadeEstoque) {
            this.nome = nome;
            this.preco = preco;
            this.quantidadeEstoque = quantidadeEstoque;
        }

        public void exibirInformacoes() {
            System.out.println("Nome: " + nome);
            System.out.printf("Preço: R$ %.2f%n", preco);
            System.out.println("Quantidade em estoque: " + quantidadeEstoque);
        }
    }

