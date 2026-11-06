/**
 * Exercício 04 — Média da turma
 *
 * Lê 8 notas de alunos, calcula a média da turma e informa quantos alunos
 * foram aprovados (nota >= 60) e quantos foram reprovados (nota < 60).
 *
 * Conceitos praticados: array, funções, `reduce`, `filter` e condicionais.
 *
 * Correções feitas na versão original:
 *   - os `while (media >= 60)` e `while (media < 60)` eram laços infinitos,
 *     pois a variável `media` nunca mudava dentro deles;
 *   - a função `mediaTurma()` não retornava a média (retornava `undefined`);
 *   - a contagem de aprovados/reprovados era feita sobre a média da turma,
 *     e não sobre a nota de cada aluno.
 *
 * Como executar (na raiz do projeto):
 *   node 01-logica-js/04-media-turma.js
 */

const prompt = require('prompt-sync')();

const QUANTIDADE_NOTAS = 8; // total de alunos/notas
const NOTA_APROVACAO = 60;  // nota mínima para aprovação

/**
 * Lê as notas dos alunos e devolve um array.
 * @param {number} quantidade - quantidade de notas a ler
 * @returns {number[]} notas digitadas
 */
function lerNotas(quantidade) {
  const notas = [];

  for (let i = 0; i < quantidade; i++) {
    const nota = Number(prompt(`Digite a ${i + 1}ª nota: `));
    notas.push(nota);
  }

  return notas;
}

/**
 * Calcula a média aritmética de uma lista de notas.
 * @param {number[]} notas
 * @returns {number} média da turma
 */
function calcularMedia(notas) {
  const soma = notas.reduce((total, nota) => total + nota, 0);
  return soma / notas.length;
}

/**
 * Conta quantos alunos atingiram a nota mínima.
 * @param {number[]} notas
 * @returns {number} quantidade de aprovados
 */
function contarAprovados(notas) {
  return notas.filter((nota) => nota >= NOTA_APROVACAO).length;
}

// ---------------------------------------------------------------------------
// Programa principal
// ---------------------------------------------------------------------------
const notas = lerNotas(QUANTIDADE_NOTAS);
const media = calcularMedia(notas);
const aprovados = contarAprovados(notas);
const reprovados = notas.length - aprovados;
const somaDasNotas = notas.reduce((total, nota) => total + nota, 0);

console.log('\n===== RESULTADO DA TURMA =====');
console.log(`Notas: ${notas.join(', ')}`);
console.log(`Soma das notas: ${somaDasNotas}`);
console.log(`Média da turma: ${media.toFixed(2)}`);
console.log(`Aprovados: ${aprovados}`);
console.log(`Reprovados: ${reprovados}`);
