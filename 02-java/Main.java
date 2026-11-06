import java.util.Locale;
import java.util.Scanner;

/**
 * Programa principal do exercício de POO (Papelaria).
 *
 * Mostra um menu com as opções:
 *   1 - Cadastrar produto
 *   2 - Consultar estoque
 *   3 - Repor estoque
 *   4 - Vender
 *   0 - Sair
 *
 * A classe Produto fica em Produto.java e precisa estar na mesma pasta.
 *
 * Como compilar e executar (dentro da pasta 02-java):
 *   javac Produto.java Main.java
 *   java Main
 */
public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        int opcao;

        // Fica null até o usuário cadastrar o primeiro produto.
        Produto produto = null;

        do {
            System.out.println("\n================ PAPELARIA =================");
            System.out.println(" 1 - Cadastrar produto");
            System.out.println(" 2 - Consultar estoque");
            System.out.println(" 3 - Repor estoque");
            System.out.println(" 4 - Vender");
            System.out.println(" 0 - Sair");
            System.out.println("============================================");
            System.out.print("Digite a opção desejada: ");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\n------- Cadastro de Produto -------");
                    sc.nextLine(); // consome o "Enter" que sobrou do nextInt()

                    System.out.print("Nome do produto: ");
                    String nome = sc.nextLine();

                    System.out.print("Preço: R$ ");
                    double preco = sc.nextDouble();

                    System.out.print("Quantidade em estoque: ");
                    int quantEstoque = sc.nextInt();

                    produto = new Produto(nome, preco, quantEstoque);
                    System.out.println("Produto cadastrado com sucesso!");
                    break;

                case 2:
                    if (produto == null) {
                        System.out.println("Nenhum produto cadastrado.");
                        break;
                    }

                    System.out.println("\n--- ESTOQUE ---");
                    System.out.println("Produto : " + produto.nome);
                    System.out.printf("Preço   : R$ %.2f%n", produto.preco);
                    System.out.println("Quantidade: " + produto.quantEstoque);
                    System.out.printf("Valor total em estoque: R$ %.2f%n",
                            produto.quantEstoque * produto.preco);
                    break;

                case 3:
                    if (produto == null) {
                        System.out.println("Nenhum produto cadastrado.");
                        break;
                    }

                    System.out.print("\nQuantidade para repor: ");
                    int quantidadeReposicao = sc.nextInt();
                    produto.reporEstoque(quantidadeReposicao);
                    System.out.println("Estoque atualizado: " + produto.quantEstoque);
                    break;

                case 4:
                    if (produto == null) {
                        System.out.println("Nenhum produto cadastrado.");
                        break;
                    }

                    System.out.print("\nQuantas unidades deseja vender: ");
                    int quantidadeVenda = sc.nextInt();
                    produto.vender(quantidadeVenda);
                    System.out.println("Estoque atual: " + produto.quantEstoque);
                    break;

                case 0:
                    System.out.println("Saindo do sistema... Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

        } while (opcao != 0);

        sc.close();
    }
}
