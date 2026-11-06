import java.util.Locale;
import java.util.Scanner;

/**
 * Exercício 01 — Conversão de dólar para real
 *
 * Enunciado:
 *   - ler a cotação do dólar;
 *   - ler um valor em dólares;
 *   - converter esse valor para real;
 *   - mostrar o resultado.
 *
 * Conceitos praticados: entrada de dados com Scanner, variáveis do tipo
 * double e formatação de saída com printf.
 *
 * Como compilar e executar (dentro da pasta 02-java):
 *   javac Trabalho01.java
 *   java Trabalho01
 */
public class Trabalho01 {

    public static void main(String[] args) {
        // Locale.US garante que o separador decimal seja o ponto (5.50).
        // Sem isso, em português o usuário precisaria digitar 5,50.
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        // 1) Leitura da cotação do dólar.
        System.out.print("Digite a cotação do dólar (ex.: 5.50): ");
        double cotacao = sc.nextDouble();

        // 2) Leitura do valor em dólares.
        System.out.print("Digite o valor em dólares: ");
        double valorDolar = sc.nextDouble();

        // 3) Conversão: reais = cotação x dólares.
        double valorReal = cotacao * valorDolar;

        // 4) Exibição do resultado com duas casas decimais.
        System.out.printf("O valor em reais é: R$ %.2f%n", valorReal);

        sc.close(); // libera o recurso de leitura do teclado
    }
}
