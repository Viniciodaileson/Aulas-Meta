/**
 * Exercício 01 — Contagem de números positivos, negativos e neutros
 *
 * O programa lê 10 números digitados pelo usuário e informa quantos são:
 *   - positivos (maiores que zero);
 *   - negativos (menores que zero);
 *   - neutros   (iguais a zero).
 *
 * Conceitos praticados: vetor (array), laço de repetição, condicionais e função.
 *
 * Como executar (na raiz do projeto):
 *   npm install
 *   node 01-logica-js/01-conta-numeros.js
 */

const prompt = require('prompt-sync')(); // permite ler dados do teclado no Node.js

const QUANTIDADE = 10; // quantidade de números que serão lidos

/**
 * Lê uma sequência de números e devolve um array.
 * @param {number} quantidade - quantos números devem ser lidos
 * @returns {number[]} números digitados pelo usuário
 */
function lerNumeros(quantidade) {
  const numeros = [];

  for (let i = 0; i < quantidade; i++) {
    // O `10` no parseInt define a base decimal.
    const numero = parseInt(prompt(`Digite o ${i + 1}º número: `), 10);
    numeros.push(numero);
  }

  return numeros;
}

/**
 * Conta quantos números são positivos, negativos e neutros.
 * @param {number[]} numeros - array com os números já lidos
 * @returns {{positivos: number, negativos: number, neutros: number}}
 */
function contarNumeros(numeros) {
  let positivos = 0;
  let negativos = 0;
  let neutros = 0;

  for (const numero of numeros) {
    if (numero > 0) {
      positivos++; // número maior que zero
    } else if (numero < 0) {
      negativos++; // número menor que zero
    } else {
      neutros++; // número igual a zero
    }
  }

  return { positivos, negativos, neutros };
}

// ---------------------------------------------------------------------------
// Programa principal
// ---------------------------------------------------------------------------
const numeros = lerNumeros(QUANTIDADE);
const resultado = contarNumeros(numeros);

console.log('\n===== RESULTADO =====');
console.log(`Números digitados: ${numeros.join(', ')}`);
console.log(`Positivos: ${resultado.positivos}`);
console.log(`Negativos: ${resultado.negativos}`);
console.log(`Neutros (zero): ${resultado.neutros}`);
