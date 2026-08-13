// Construa um Algoritmo que: (10 pts)
// Leia a cotação do dólar
// Leia um valor em dólares
// Converta esse valor para Real
// Mostre o resultado
import java.util.Scanner;
public class trabalho1 {
    public static void main(String[] args) {
        // declaração de variáveis
        double cotacaoDolar, valorDolar, valorReal;
        // leitura da cotação do dólar
        System.out.print("Digite a cotação do dólar: ");
        cotacaoDolar = new java.util.Scanner(System.in).nextDouble();
        // leitura do valor em dólares
        System.out.print("Digite o valor em dólares: ");
        valorDolar = new java.util.Scanner(System.in).nextDouble();
        // conversão para Real
        valorReal = cotacaoDolar * valorDolar;
        // exibição do resultado
        System.out.printf("O valor em Real é: R$ %.2f\n", valorReal);
    }
    
}
