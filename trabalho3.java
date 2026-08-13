// Construa um algoritmo para pagamento de comissão de vendedores de
//peças, levando em consideração que sua comissão será de 5% do total da
//venda.
//Para realizar o cálculo você tem os seguintes dados: (10 pts)
// Identificação do vendedor
// Código da peça
// Preço unitário da peça
// Quantidade vendida


public class trabalho3 {
    public static void main (String[] args) {
        // declaração de variáveis
        String identificacaoVendedor, codigoPeca;
        double precoUnitario, quantidadeVendida, totalVenda, comissao;

        // leitura dos dados
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Digite a identificação do vendedor: ");
        identificacaoVendedor = scanner.nextLine();
        System.out.print("Digite o código da peça: ");
        codigoPeca = scanner.nextLine();
        System.out.print("Digite o preço unitário da peça: ");
        precoUnitario = scanner.nextDouble();
        System.out.print("Digite a quantidade vendida: ");
        quantidadeVendida = scanner.nextDouble();

        // cálculo do total da venda e da comissão
        totalVenda = precoUnitario * quantidadeVendida;
        comissao = totalVenda * 0.05;

        // exibição dos resultados
        System.out.printf("Identificação do vendedor: %s\n", identificacaoVendedor);
        System.out.printf("Código da peça: %s\n", codigoPeca);
        System.out.printf("Preço unitário da peça: R$ %.2f\n", precoUnitario);
        System.out.printf("Quantidade vendida: %.2f\n", quantidadeVendida);
        System.out.printf("Total da venda: R$ %.2f\n", totalVenda);
        System.out.printf("Comissão do vendedor (5%%): R$ %.2f\n", comissao);}
    }

    

