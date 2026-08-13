//  Desenvolva um Algoritmo que: (10 pts)
// Leia 4 (quatro) números
// Calcule e imprima o quadrado para cada um
// Some os 4 números lidos e imprima o total
import java.util.Scanner;
public class trabalho2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[4];
        int soma = 0;

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
        }

        System.out.println("Quadrados dos números:");
        for (int i = 0; i < 4; i++) {
            System.out.println(numeros[i] + "² = " + (numeros[i] * numeros[i]));
        }

        System.out.println("Soma dos números: " + soma);
    }
}
