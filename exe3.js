const prompt = require("prompt-sync")();
// Crie um programa que receba 8 notas de alunos, calcule a média da turma e informe quantos alunos foram aprovados (nota >= 60) e quantos foram reprovados (nota < 60).
let resultado;
let somaDasNotas = 0;
let aprovados = 0; // Variável para contar os aprovados
let reprovados = 0; // Variável para contar os reprovados
// função para calcular a média da turma
function mediaTurma() { 
    let media = (somaDasNotas / 8);
    // Condicional para contar aprovados e reprovados
    while (media >= 60) {
        aprovados = aprovados + 1;

    } 
    while (media < 60) {
        reprovados = reprovados + 1;
    }  
}   
// array das notas
let notas = [];

// função pra pegar as notas.
for (let i = 0; i < 8; i++) {
    let aluno = Number(prompt("Adicione a " + (i + 1) + "° nota: "))
    notas.push(aluno);
}
// for para somar as notas do array
for (let i = 0; i < notas.length; i++) {
    somaDasNotas = somaDasNotas + notas[i];
}
resultado = mediaTurma();
console.log("A media das notas são: " + resultado);
console.log("A soma das notas é :" + somaDasNotas);
console.log("Número de aprovados: " + aprovados);
console.log("Número de reprovados: " + reprovados);