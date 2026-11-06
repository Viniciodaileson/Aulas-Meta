import java.util.Scanner;

/**
 * Exercício 02 — Quadrado e soma de quatro números
 *
 * Enunciado:
 *   - ler 4 números;
 *   - calcular e imprimir o quadrado de cada um;
 *   - somar os 4 números lidos e imprimir o total.
 *
 * Conceitos praticados: vetor (array), laço de repetição e operações
 * matemáticas.
 *
 * Como compilar e executar (dentro da pasta 02-java):
 *   javac Trabalho02.java
 *   java Trabalho02
 */
public class Trabalho02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int QUANTIDADE = 4;
        int[] numeros = new int[QUANTIDADE];
        int soma = 0;

        // Leitura dos 4 números e cálculo da soma total.
        for (int i = 0; i < QUANTIDADE; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
            soma += numeros[i];
        }

        // Para cada número, mostramos o seu quadrado (numero * numero).
        System.out.println("\nQuadrados dos números:");
        for (int i = 0; i < QUANTIDADE; i++) {
            int quadrado = numeros[i] * numeros[i];
            System.out.printf("%d² = %d%n", numeros[i], quadrado);
        }

        // Resultado final pedido no enunciado.
        System.out.println("Soma dos 4 números: " + soma);

        sc.close();
    }
}
