const prompt = require('prompt-sync')();

function Tabuada() {
    const numero = Number(prompt('Digite um número para ver a tabuada: '));   
    for (let i = 1; i <= 10; i++) {
        console.log(`${numero} x ${i} = ${numero * i}`);
    }
}   
Tabuada();