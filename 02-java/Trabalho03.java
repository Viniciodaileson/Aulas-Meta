import java.util.Locale;
import java.util.Scanner;

/**
 * Exercício 03 — Comissão de vendedor
 *
 * Enunciado:
 *   Um vendedor recebe 5% de comissão sobre o total vendido.
 *   Ler os dados abaixo e calcular o total da venda e a comissão:
 *     - identificação do vendedor;
 *     - código da peça;
 *     - preço unitário da peça;
 *     - quantidade vendida.
 *
 * Conceitos praticados: leitura de texto e números, cálculo percentual e
 * formatação com printf.
 *
 * Como compilar e executar (dentro da pasta 02-java):
 *   javac Trabalho03.java
 *   java Trabalho03
 */
public class Trabalho03 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // separador decimal: ponto

        Scanner sc = new Scanner(System.in);

        // Leitura dos dados. nextLine() lê o nome completo (com espaços).
        System.out.print("Nome do vendedor: ");
        String vendedor = sc.nextLine();

        System.out.print("Código da peça: ");
        String codigoPeca = sc.nextLine();

        System.out.print("Preço unitário da peça: R$ ");
        double precoUnitario = sc.nextDouble();

        System.out.print("Quantidade vendida: ");
        int quantidadeVendida = sc.nextInt();

        // Cálculos principais.
        double totalVenda = precoUnitario * quantidadeVendida;
        double comissao = totalVenda * 0.05; // 5% do total

        // Exibição dos resultados.
        System.out.println("\n===== RESULTADO =====");
        System.out.println("Vendedor: " + vendedor);
        System.out.println("Código da peça: " + codigoPeca);
        System.out.printf("Preço unitário: R$ %.2f%n", precoUnitario);
        System.out.println("Quantidade vendida: " + quantidadeVendida);
        System.out.printf("Total da venda: R$ %.2f%n", totalVenda);
        System.out.printf("Comissão (5%%): R$ %.2f%n", comissao);

        sc.close();
    }
}
