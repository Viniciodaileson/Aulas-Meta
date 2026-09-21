const prompt = require('prompt-sync')();
let array = [];
let soma = 0;
function somarArray(){
    for (let i = 0; i < array.length; i++) {
        soma += array[i];
    }
    return soma;
}
   for (let i = 0; i <= 6; i++) {
       let numero = Number(prompt('Digite o ' + (i + 1) + 'º número: '));
       array.push(numero);
   }
 let resultado = somarArray();
console.log('A soma dos números digitados é: ' + somarArray());