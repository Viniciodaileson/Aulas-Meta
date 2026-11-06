import java.util.Locale;
import java.util.Scanner;

/**
 * Exercício — Loja (resumo de compra)
 *
 * Lê os dados de uma compra e exibe um resumo com:
 *   - subtotal (preço unitário x quantidade);
 *   - desconto em porcentagem informado pelo usuário;
 *   - total a pagar;
 *   - troco (valor pago - total).
 *
 * Correções feitas na versão original:
 *   - o desconto era tratado ao mesmo tempo como quantidade e como valor,
 *     gerando um cálculo incorreto;
 *   - a mensagem "Digite o valor pago" usava System.err (saída de erro);
 *   - o subtotal era calculado com o valor pago em vez de preço x quantidade.
 *
 * Como compilar e executar (dentro da pasta 02-java):
 *   javac Loja.java
 *   java Loja
 */
public class Loja {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        // ----- Entrada de dados -----
        System.out.print("Nome do cliente: ");
        String nomeCliente = sc.nextLine();

        System.out.print("Nome do produto: ");
        String nomeProduto = sc.nextLine();

        System.out.print("Preço unitário: R$ ");
        double precoUnitario = sc.nextDouble();

        System.out.print("Quantidade comprada: ");
        int quantidade = sc.nextInt();

        System.out.print("Desconto em porcentagem (0 a 100): ");
        double percentualDesconto = sc.nextDouble();

        System.out.print("Valor pago pelo cliente: R$ ");
        double valorPago = sc.nextDouble();

        // ----- Cálculos -----
        double subtotal = precoUnitario * quantidade;
        double valorDesconto = subtotal * (percentualDesconto / 100);
        double totalDaCompra = subtotal - valorDesconto;
        double troco = valorPago - totalDaCompra;

        // ----- Resumo -----
        System.out.println("\n===============================");
        System.out.println("      RESUMO DA COMPRA");
        System.out.println("===============================");
        System.out.println("Cliente : " + nomeCliente);
        System.out.println("Produto : " + nomeProduto);
        System.out.printf("Preço unitário: R$ %.2f%n", precoUnitario);
        System.out.println("Quantidade: " + quantidade);
        System.out.printf("Subtotal: R$ %.2f%n", subtotal);
        System.out.printf("Desconto (%.1f%%): R$ %.2f%n", percentualDesconto, valorDesconto);
        System.out.printf("Total da compra: R$ %.2f%n", totalDaCompra);
        System.out.printf("Valor pago: R$ %.2f%n", valorPago);
        System.out.printf("Troco: R$ %.2f%n", troco);

        sc.close();
    }
}
