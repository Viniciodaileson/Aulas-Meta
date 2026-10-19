public class Produto {

   
    String nome;
    double preco;
    int quantEstoque;

    
    public Produto(String nome, double preco, int quantEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantEstoque = quantEstoque;
    }

    
    public void vender(int quantidade) {
        
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

        if (quantEstoque <= 0) {
            System.out.println("O produto " + nome + " está esgotado.");
        }
    } 

    
    public void reporEstoque(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade inválida para reposição.");
            return;
        }
        
        quantEstoque += quantidade;
        System.out.println("Estoque reposto com sucesso! Quantidade adicionada: " + quantidade);
    }
}
