/**
 * Exercício 02 — Números ímpares até um limite
 *
 * O usuário informa um número e o programa mostra todos os números ímpares
 * de 1 até esse número (inclusive).
 *
 * Conceito principal: laço de repetição + operador de resto (%).
 * Um número é ímpar quando o resto da divisão por 2 é diferente de zero.
 *
 * Como executar (na raiz do projeto):
 *   node 01-logica-js/02-impares.js
 */

const prompt = require('prompt-sync')();

/**
 * Monta um array com os números ímpares de 1 até `limite`.
 * @param {number} limite - valor máximo da sequência
 * @returns {number[]} números ímpares encontrados
 */
function obterImpares(limite) {
  const impares = [];

  for (let i = 1; i <= limite; i++) {
    // i % 2 !== 0 significa que a divisão por 2 deixa resto.
    if (i % 2 !== 0) {
      impares.push(i);
    }
  }

  return impares;
}

// ---------------------------------------------------------------------------
// Programa principal
// ---------------------------------------------------------------------------
const limite = Number(prompt('Digite um número para ver os ímpares até ele: '));
const impares = obterImpares(limite);

console.log(`\nNúmeros ímpares de 1 até ${limite}:`);
console.log(impares.join(', '));
