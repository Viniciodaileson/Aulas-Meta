import java.util.Scanner;

public class loja {
    public static void main(String[] args) {

        String nomeCliente;
        String nomeProduto;
        double precoUnitario, valorPagamento, totalDaCompra, troco;
        int quantComprada, desconto;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do cliente: ");
        nomeCliente = sc.nextLine();
        System.out.println("Digite o Produto: ");
        nomeProduto = sc.nextLine();
        System.out.println("Digite o preço unitario: ");
        precoUnitario = sc.nextDouble();
        System.out.println("Digite a quantidade: ");
        quantComprada = sc.nextInt();
        System.out.println("Digite o desconto: ");
        desconto = sc.nextInt();
        System.err.println("Digite o valor pago pelo cliente: ");
        valorPagamento = sc.nextDouble();

        System.out.println("===============================");
        System.out.println("  RESUMO DA COMPRA   ");
        System.out.println("================================");
        System.out.println("");
        System.out.println("Cliente :" + nomeCliente);
        System.out.println("Produto: " + nomeProduto);
        System.out.println("Preço Unitario: R$ " + precoUnitario);
        System.out.println("");
        System.out.println("Subtotal: " + valorPagamento);
        desconto = (int) (valorPagamento - (desconto * 0.10));
        System.out.println("Desconto: " + desconto);
        totalDaCompra = valorPagamento - desconto;
        System.out.print("Total da compra : " + totalDaCompra);

        System.out.println("Valor pago: ");
        troco = (double) (valorPagamento - totalDaCompra);
        System.out.println("troco: R$ " + troco);

        sc.close();
    }

}
