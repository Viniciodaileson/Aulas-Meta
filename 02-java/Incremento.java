/**
 * Exercício — Pós-incremento e pré-incremento
 *
 * Demonstra a diferença entre `x++` (pós-incremento) e `++x` (pré-incremento).
 *
 * Como compilar e executar (dentro da pasta 02-java):
 *   javac Incremento.java
 *   java Incremento
 */
public class Incremento {

    public static void main(String[] args) {
        int x = 5;

        // Pós-incremento: primeiro usa o valor atual (5) na atribuição,
        // depois incrementa x. Por isso y recebe 5 e x passa a valer 6.
        int y = x++;

        System.out.println("x = " + x); // 6
        System.out.println("y = " + y); // 5

        // Para comparação: no pré-incremento o valor é somado antes do uso.
        int a = 5;
        int b = ++a; // a vira 6 e b recebe 6

        System.out.println("a = " + a); // 6
        System.out.println("b = " + b); // 6
    }
}
