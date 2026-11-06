import java.util.Locale;
import java.util.Scanner;

/**
 * Exercício — Pastelaria
 *
 * Simula o caixa de uma pastelaria:
 *   - pastel de carne custa R$ 1,50;
 *   - pastel de queijo custa R$ 1,30;
 *   - o usuário informa o código e a quantidade de cada pedido;
 *   - ao final, o programa mostra o resumo e o valor total da compra.
 *
 * Correção feita na versão original:
 *   o bloco que calculava os totais estava antes do laço de pedidos,
 *   então ele era executado com os totais ainda zerados. Agora o resumo
 *   é calculado e exibido somente depois que todos os pedidos são feitos.
 *
 * Como compilar e executar (dentro da pasta 02-java):
 *   javac Pastelaria.java
 *   java Pastelaria
 */
public class Pastelaria {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        // Constantes evitam "números mágicos" espalhados pelo código.
        final double PRECO_CARNE = 1.50;
        final double PRECO_QUEIJO = 1.30;

        Scanner teclado = new Scanner(System.in);

        int totalCarne = 0;
        int totalQueijo = 0;
        String resposta = "S";

        System.out.println("--- Pastelândia Galeria Ouvidor ---");
        System.out.println("1 - Pastel de Carne  | R$ 1,50");
        System.out.println("2 - Pastel de Queijo | R$ 1,30");
        System.out.println();

        // Laço principal: repete enquanto o usuário digitar "S".
        while (resposta.equalsIgnoreCase("S")) {
            System.out.print("Código do pastel (1 ou 2): ");
            int codigo = teclado.nextInt();

            System.out.print("Quantidade: ");
            int quantidade = teclado.nextInt();

            if (codigo == 1) {
                totalCarne += quantidade;
            } else if (codigo == 2) {
                totalQueijo += quantidade;
            } else {
                System.out.println("Código inválido! Tente novamente.");
                continue; // volta ao início do laço sem perguntar se deseja sair
            }

            System.out.print("Digite 'S' para continuar ou 'N' para sair: ");
            resposta = teclado.next();
        }

        // Cálculo dos valores por sabor e do total geral.
        double valorCarne = totalCarne * PRECO_CARNE;
        double valorQueijo = totalQueijo * PRECO_QUEIJO;
        double valorTotal = valorCarne + valorQueijo;

        System.out.println("\n===== RESUMO DO PEDIDO =====");
        System.out.println("Pastéis de carne : " + totalCarne);
        System.out.printf("Valor de carne   : R$ %.2f%n", valorCarne);
        System.out.println("Pastéis de queijo: " + totalQueijo);
        System.out.printf("Valor de queijo  : R$ %.2f%n", valorQueijo);
        System.out.printf("TOTAL DA COMPRA  : R$ %.2f%n", valorTotal);

        teclado.close();
    }
}
