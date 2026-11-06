/**
 * Exercício 03 — Inverter uma lista
 *
 * O programa pede o tamanho da lista, lê os elementos e depois mostra:
 *   - a lista na ordem em que foi digitada;
 *   - a mesma lista invertida.
 *
 * Conceitos praticados: array, laço `for` decrescente e função.
 *
 * Correções feitas na versão original:
 *   - o nome da variável `promt` foi corrigido para `prompt`;
 *   - a função `inverterLista()` agora é chamada no final do arquivo
 *     (antes ela era apenas declarada e o programa não fazia nada).
 *
 * Como executar (na raiz do projeto):
 *   node 01-logica-js/03-inverte-lista.js
 */

const prompt = require('prompt-sync')();

/**
 * Lê uma lista de elementos e devolve a lista original e a invertida.
 * @returns {{lista: string[], listaInvertida: string[]}}
 */
function inverterLista() {
  const lista = [];
  const tamanho = parseInt(prompt('Digite o tamanho da lista: '), 10);

  // Lê cada elemento digitado pelo usuário.
  for (let i = 0; i < tamanho; i++) {
    const elemento = prompt(`Digite o elemento ${i + 1}: `);
    lista.push(elemento);
  }

  // Percorre a lista de trás para frente para montar a versão invertida.
  const listaInvertida = [];
  for (let i = lista.length - 1; i >= 0; i--) {
    listaInvertida.push(lista[i]);
  }

  return { lista, listaInvertida };
}

// ---------------------------------------------------------------------------
// Programa principal
// ---------------------------------------------------------------------------
const { lista, listaInvertida } = inverterLista();

console.log('\nLista original :', lista);
console.log('Lista invertida:', listaInvertida);
