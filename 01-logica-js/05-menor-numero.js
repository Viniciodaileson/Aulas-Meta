/**
 * Exercício 05 — Menor número de uma lista
 *
 * Lê 10 números e mostra qual é o menor valor digitado.
 *
 * Conceitos praticados: array, função e comparação entre valores.
 *
 * Correções feitas na versão original:
 *   - o nome `resutlado` foi corrigido para `resultado`;
 *   - a mensagem do prompt não juntava o número da tentativa de forma legível;
 *   - a função agora recebe o array por parâmetro e retorna o menor valor.
 *
 * Como executar (na raiz do projeto):
 *   node 01-logica-js/05-menor-numero.js
 */

const prompt = require('prompt-sync')();

const QUANTIDADE = 10;

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
 * Encontra o menor número do array.
 * @param {number[]} numeros
 * @returns {number} menor valor encontrado
 */
function encontrarMenor(numeros) {
  let menor = numeros[0]; // começa assumindo que o primeiro é o menor

  for (let i = 1; i < numeros.length; i++) {
    if (numeros[i] < menor) {
      menor = numeros[i]; // encontrou um valor ainda menor
    }
  }

  return menor;
}

// ---------------------------------------------------------------------------
// Programa principal
// ---------------------------------------------------------------------------
const numeros = lerNumeros(QUANTIDADE);
const menor = encontrarMenor(numeros);

console.log(`\nNúmeros digitados: ${numeros.join(', ')}`);
console.log(`O menor número digitado foi: ${menor}`);
