import java.util.Scanner;

public class Main { 

    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);
        int opcao;
        
        
        Produto produto = null; 

        do {
            System.out.println("\n================ PAPELARIA =================");
            System.out.println(" 1 - Cadastra Produto");
            System.out.println(" 2 - Consultar Estoque");
            System.out.println(" 3 - Repor Estoque");
            System.out.println(" 4 - Venda");
            System.out.println(" 0 - Sair");
            System.out.println(" ================================= ");
            System.out.print(" Digite a opção desejada: ");

            opcao = Sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\n ------- Cadastro de Produtos ------");
                    Sc.nextLine(); 
                    System.out.println("Digite o nome do produto:");
                    String nome = Sc.nextLine();
                    System.out.println("Digite o preço:");
                    double preco = Sc.nextDouble();
                    System.out.println("Digite a quantidade em estoque: ");
                    int quantEstoque = Sc.nextInt();

                    // Cria o objeto e salva na variável que está fora do loop
                    produto = new Produto(nome, preco, quantEstoque);
                    System.out.println("Produto cadastrado com sucesso!");
                    break;

                case 2:
                    if (produto == null) {
                        System.out.println("Nenhum produto cadastrado.");
                        break;
                    }
                    System.out.println("\n --- ESTOQUE ---");
                    System.out.println("Produto : " + produto.nome);
                    System.out.println("Preço: R$ " + produto.preco);
                    System.out.println("Quantidade : " + produto.quantEstoque);
                    System.out.println("Valor total em estoque: R$ " + (produto.quantEstoque * produto.preco));
                    break;

                case 3:
                    if (produto == null) {
                        System.out.println("Nenhum produto cadastrado.");
                        break;
                    }
                    System.out.println("\n--- REPOSIÇÃO ---");
                    System.out.print("Digite a quantidade para repor: ");
                    int quantidadereposicao = Sc.nextInt();
                    
                    produto.reporEstoque(quantidadereposicao);
                    System.out.println("Estoque atualizado: " + produto.quantEstoque);
                    break;

                case 4:
                    if (produto == null) {
                        System.out.println("Nenhum produto cadastrado.");
                        break;
                    }
                   
                    System.out.println("\n--- VENDA ---");
                    System.out.print("Quantas unidades deseja comprar: ");
                    int quantidadeVenda = Sc.nextInt();

                    produto.vender(quantidadeVenda);
                    System.out.println("Estoque atual: " + produto.quantEstoque);
                    break;

                case 0:
                    System.out.println("Saindo do sistema... Até logo!");
                    break;

                default:
                    
                    System.out.println("Opção Inválida. Tente novamente.");
                    break;
            } 

        } while (opcao != 0); 

        Sc.close();
    }
}
