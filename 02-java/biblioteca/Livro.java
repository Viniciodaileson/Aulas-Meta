public class Livro {

    String titulo;
    String autor;
    int ano;
    int quant;

    void consultarLivros() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano: " + ano);
        System.out.println("Disponíveis: " + quant);
    }

    void emprestarLivro(int quantidadeEmprestar) {
        if (quantidadeEmprestar > 0 && quantidadeEmprestar <= quant) {
            quant -= quantidadeEmprestar; // Subtrai do estoque
            System.out.println("Livro emprestado com sucesso!");
        } else {
            System.out.println("Quantidade inválida ou estoque insuficiente.");
        }
    }

    void devolver(int quantidadeDevolvida) {
        if (quantidadeDevolvida <= 0) {
            System.out.println("Quantidade inválida. O livro não foi devolvido!");
        } else {
            quant += quantidadeDevolvida; // Soma ao estoque
            System.out.println("Livro devolvido com sucesso!");
        }
    }

    boolean verificarDisponibilidade() {
        return quant > 0;
    }
}
