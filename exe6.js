const prompt = require('prompt-sync')();

function  mostrarImpares() {
    let numero = Number(prompt('Digite um número para ver os números ímpares até ele: '));
    for (let i = 1; i <= numero; i++) {
        if (i % 2 !== 0) {
            console.log(i);
        }
    }
}
mostrarImpares();