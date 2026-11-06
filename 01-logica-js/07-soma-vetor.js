/**
 * Exercício 07 — Soma dos elementos de um vetor
 *
 * Lê 7 números, guarda em um array e mostra a soma de todos eles.
 *
 * Conceitos praticados: array, função, laço de repetição e `reduce`.
 *
 * Correções feitas na versão original:
 *   - a função `somarArray()` era chamada duas vezes no `console.log`
 *     (a primeira chamada já tinha sido feita para guardar `resultado`);
 *   - o array agora é passado como parâmetro, deixando a função reutilizável.
 *
 * Como executar (na raiz do projeto):
 *   node 01-logica-js/07-soma-vetor.js
 */

const prompt = require('prompt-sync')();

const QUANTIDADE = 7;

/**
 * Lê uma quantidade de números e devolve um array.
 * @param {number} quantidade
 * @returns {number[]}
 */
function lerNumeros(quantidade) {
  const numeros = [];

  for (let i = 0; i < quantidade; i++) {
    const numero = Number(prompt(`Digite o ${i + 1}º número: `));
    numeros.push(numero);
  }

  return numeros;
}

/**
 * Soma todos os elementos de um array.
 * @param {number[]} numeros
 * @returns {number} soma dos valores
 */
function somarArray(numeros) {
  // `reduce` percorre o array acumulando o total (começando em 0).
  return numeros.reduce((total, numero) => total + numero, 0);
}

// ---------------------------------------------------------------------------
// Programa principal
// ---------------------------------------------------------------------------
const numeros = lerNumeros(QUANTIDADE);
const soma = somarArray(numeros);

console.log(`\nNúmeros digitados: ${numeros.join(', ')}`);
console.log(`A soma dos números digitados é: ${soma}`);
