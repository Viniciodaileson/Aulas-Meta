/**
 * Exercício 08 — Tabuada
 *
 * O usuário informa um número e o programa imprime a tabuada desse número
 * de 1 a 10.
 *
 * Conceitos praticados: laço `for`, template strings e operações matemáticas.
 *
 * Como executar (na raiz do projeto):
 *   node 01-logica-js/08-tabuada.js
 */

const prompt = require('prompt-sync')();

/**
 * Exibe a tabuada de um número de 1 a 10.
 * @param {number} numero - número da tabuada
 */
function exibirTabuada(numero) {
  for (let i = 1; i <= 10; i++) {
    // Template string: ${...} insere o valor da variável dentro do texto.
    console.log(`${numero} x ${i} = ${numero * i}`);
  }
}

// ---------------------------------------------------------------------------
// Programa principal
// ---------------------------------------------------------------------------
const numero = Number(prompt('Digite um número para ver a tabuada: '));

console.log(`\n===== TABUADA DO ${numero} =====`);
exibirTabuada(numero);
