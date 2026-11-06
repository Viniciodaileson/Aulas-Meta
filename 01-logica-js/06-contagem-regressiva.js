/**
 * Exercício 06 — Contagem regressiva
 *
 * O usuário informa um número e o programa faz uma contagem regressiva
 * até zero, mostrando um número por linha.
 *
 * Conceitos praticados: laço `while` e decremento (`numero--`).
 *
 * Como executar (na raiz do projeto):
 *   node 01-logica-js/06-contagem-regressiva.js
 */

const prompt = require('prompt-sync')();

/**
 * Exibe a contagem regressiva de `numero` até 0.
 * @param {number} numero - valor inicial da contagem
 */
function contagemRegressiva(numero) {
  // Enquanto o número for maior ou igual a zero, mostramos e decrementamos.
  while (numero >= 0) {
    console.log(numero);
    numero--; // equivale a: numero = numero - 1
  }
}

// ---------------------------------------------------------------------------
// Programa principal
// ---------------------------------------------------------------------------
const numeroInicial = Number(prompt('Digite um número para iniciar a contagem regressiva: '));

if (Number.isInteger(numeroInicial) && numeroInicial >= 0) {
  contagemRegressiva(numeroInicial);
} else {
  console.log('Digite um número inteiro maior ou igual a zero.');
}
