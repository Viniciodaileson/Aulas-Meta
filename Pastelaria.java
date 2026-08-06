import java.util.Scanner;

public class Pastelaria {
    
    public static void main(String[] args) throws Exception {
        System.out.println("--- Pastelândia Galeria Ouvidor ---");
        System.out.println();
        System.out.println("1 - Pastel Carne | 2 - Pastel Queijo");
        System.out.println("Carne = R$ 1.50  | Queijo = R$ 1.30");
        System.out.println();

        // instância do objeto scanner
        Scanner teclado = new Scanner(System.in);

        // declaraçãoi de inicialização de variáveis
        String resposta = "S";
        int codigo;
        int quantidade = 0;
        int totalCarne = 0;
        int totalQueijo =0;
        double precoCarne = 1.50;
        double precoQueijo = 1.30;

// condiçao para calculo do valor total de cada tipo de pastel
    if (totalCarne > 0) {
        double valorTotalCarne = totalCarne * precoCarne;
        System.out.println("Valor total de Pastel de Carne: R$ " + valorTotalCarne);
    }
    if (totalQueijo > 0) {
        double valorTotalQueijo = totalQueijo * precoQueijo;
        System.out.println("Valor total de Pastel de Queijo: R$ " + valorTotalQueijo);
    }

        // leitura de dados
       while (resposta.equalsIgnoreCase("S")) {
        System.out.println("Digite o código do pastel: ");
        codigo = teclado.nextInt();
        System.out.println("Digite a quantidade: ");
        quantidade = teclado.nextInt();

        if (codigo == 1) {
            totalCarne += quantidade;
        } else if (codigo == 2) {
            totalQueijo += quantidade;
        } else {
            System.out.println("Código inválido!");
        }

        System.out.println("Digite  'S' para continuar ou 'N' para sair: ");
        resposta = teclado.next();

    }
    teclado.close();
    System.out.println("Total de Pastel de Carne: " + totalCarne);
    precoCarne = totalCarne * precoCarne;
    System.out.println("valor total de Pastel de Carne: R$ " + precoCarne);
    System.out.println("Total de Pastel de Queijo: " + totalQueijo);
    precoQueijo = totalQueijo * precoQueijo;
    System.out.println("valor total de Pastel de Queijo: R$ " + precoQueijo) ;
    System.out.println("Valor total da compra: R$ " + (precoCarne + precoQueijo));

    }
}
