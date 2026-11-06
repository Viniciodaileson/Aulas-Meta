/**
 * Classe Produto — usada no exercício de Programação Orientada a Objetos.
 *
 * Representa um produto de papelaria com nome, preço e quantidade em estoque.
 * Os métodos `vender` e `reporEstoque` alteram o estoque com validação.
 */
public class Produto {

    // Atributos (estado do objeto).
    String nome;
    double preco;
    int quantEstoque;

    /**
     * Construtor: cria um produto já com os dados informados.
     * @param nome         nome do produto
     * @param preco        preço unitário
     * @param quantEstoque quantidade inicial em estoque
     */
    public Produto(String nome, double preco, int quantEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantEstoque = quantEstoque;
    }

    /**
     * Realiza uma venda, diminuindo a quantidade em estoque.
     * @param quantidade quantidade vendida
     */
    public void vender(int quantidade) {
        // Validações antes de alterar o estoque.
        if (quantidade <= 0) {
            System.out.println("Quantidade inválida para a venda.");
            return;
        }

        if (quantidade > quantEstoque) {
            System.out.println("Quantidade insuficiente em estoque.");
            return;
        }

        quantEstoque -= quantidade;
        System.out.println("Venda realizada com sucesso! Quantidade vendida: " + quantidade);

        // Aviso quando o estoque acaba.
        if (quantEstoque == 0) {
            System.out.println("O produto " + nome + " está esgotado.");
        }
    }

    /**
     * Repõe o estoque com uma quantidade positiva.
     * @param quantidade quantidade a adicionar
     */
    public void reporEstoque(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade inválida para reposição.");
            return;
        }

        quantEstoque += quantidade;
        System.out.println("Estoque reposto com sucesso! Quantidade adicionada: " + quantidade);
    }
}
