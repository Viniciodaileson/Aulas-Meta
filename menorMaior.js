const prompt = require('prompt-sync')();
let array = [];
let menor = 0;
let numero = 0;

for (let i = 0; i < 10; i++) {
    numero = parseInt(prompt("Digite o" + numero + " número: "));
    array.push(numero);
}
function menorNumero(array) {
    menor = array[0];
    for (let i = 1; i < array.length; i++) {
        if (array[i] < menor) {
            menor = array[i];
        }
    }
} resutlado = menorNumero(array);
console.log("O menor número digitado é: " + menor);


